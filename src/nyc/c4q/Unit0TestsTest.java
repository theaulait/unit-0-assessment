package nyc.c4q;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class Unit0TestsTest {

    // http://stackoverflow.com/a/1119559/198348
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testPrintHelloWorld() throws Exception {
        Unit0Tests.printHelloWorld();
        assertEquals("Hello World\n", outContent.toString());
    }

    @Test
    public void testReturnPrimitiveBooleanTrueType() throws Exception {
        Class returnType = Unit0Tests.class.getMethod("returnPrimitiveBooleanTrue").getReturnType();
        assertEquals(returnType, boolean.class);
    }

    @Test
    public void testReturnPrimitiveBooleanTrue() throws Exception {
        assertEquals(Unit0Tests.returnPrimitiveBooleanTrue(), true);
    }

    @Test
    public void testReturnPrimitiveInt1729Type() throws Exception {
        Class returnType = Unit0Tests.class.getMethod("returnPrimitiveInt1729", null).getReturnType();
        assertEquals(returnType, int.class);
    }

    @Test
    public void testReturnPrimitiveInt1729() throws Exception {
        assertEquals(Unit0Tests.returnPrimitiveInt1729(), 1729);
    }

    @Test
    public void testReturnPrimitiveDoubleThreePointOneFourType() throws Exception {
        Class returnType = Unit0Tests.class.getMethod("returnPrimitiveDoubleThreePointOneFour").getReturnType();
        assertEquals(returnType, double.class);
    }

    @Test
    public void testReturnPrimitiveDoubleThreePointOneFour() throws Exception {
        assertEquals((Double) Unit0Tests.returnPrimitiveDoubleThreePointOneFour(), 3.14, 0.01);
    }

    @Test
    public void testReturnPrimitiveCharZType() throws Exception {
        Class returnType = Unit0Tests.class.getMethod("returnPrimitiveCharZ").getReturnType();
        assertEquals(returnType, char.class);
    }

    @Test
    public void testReturnPrimitiveCharZ() throws Exception {
        assertEquals(Unit0Tests.returnPrimitiveCharZ(), 'Z');
    }

    @Test
    public void testPrintSumOf1Upto10UsingForLoop() throws Exception {
        Unit0Tests.printSumOf1Upto10UsingForLoop();
        assertEquals("45\n", outContent.toString());
    }

    @Test
    public void testPrintSumOf1Upto10000UsingForLoop() throws Exception {
        Unit0Tests.printSumOf1Upto10000UsingForLoop();
        assertEquals("49995000\n", outContent.toString());
    }

    @Test
    public void testIsEven() throws Exception {
        assertTrue(Unit0Tests.isNotOdd(0));
        assertFalse(Unit0Tests.isNotOdd(1));
        assertTrue(Unit0Tests.isNotOdd(2));
        assertFalse(Unit0Tests.isNotOdd(3));
        assertTrue(Unit0Tests.isNotOdd(4));
        assertFalse(Unit0Tests.isNotOdd(5));
        assertTrue(Unit0Tests.isNotOdd(6));
    }

    @Test
    public void testIsOdd() throws Exception {
        assertFalse(Unit0Tests.isOdd(0));
        assertTrue(Unit0Tests.isOdd(1));
        assertFalse(Unit0Tests.isOdd(2));
        assertTrue(Unit0Tests.isOdd(3));
        assertFalse(Unit0Tests.isOdd(4));
        assertTrue(Unit0Tests.isOdd(5));
        assertFalse(Unit0Tests.isOdd(6));
    }

    @Test
    public void testIsMultipleOfThree() throws Exception {
        assertTrue(Unit0Tests.isMultipleOfThree(0));
        assertFalse(Unit0Tests.isMultipleOfThree(1));
        assertFalse(Unit0Tests.isMultipleOfThree(2));
        assertTrue(Unit0Tests.isMultipleOfThree(3));
        assertFalse(Unit0Tests.isMultipleOfThree(4));
        assertFalse(Unit0Tests.isMultipleOfThree(5));
        assertTrue(Unit0Tests.isMultipleOfThree(6));
        assertFalse(Unit0Tests.isMultipleOfThree(7));
        assertFalse(Unit0Tests.isMultipleOfThree(8));
        assertTrue(Unit0Tests.isMultipleOfThree(9));
    }

    @Test
    public void testIsOddAndIsMultipleOfThree() throws Exception {
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(0));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(1));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(2));
        assertTrue(Unit0Tests.isOddAndIsMultipleOfThree(3));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(4));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(5));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(6));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(7));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(8));
        assertTrue(Unit0Tests.isOddAndIsMultipleOfThree(9));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(10));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(11));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(12));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(13));
        assertFalse(Unit0Tests.isOddAndIsMultipleOfThree(14));
        assertTrue(Unit0Tests.isOddAndIsMultipleOfThree(15));
    }

    @Test
    public void testIsPositiveOrIsEven() throws Exception {

        assertFalse(Unit0Tests.isPositiveOrIsEven(-5));
        assertTrue(Unit0Tests.isPositiveOrIsEven(-4));
        assertFalse(Unit0Tests.isPositiveOrIsEven(-3));
        assertTrue(Unit0Tests.isPositiveOrIsEven(-2));
        assertFalse(Unit0Tests.isPositiveOrIsEven(-1));

        assertTrue(Unit0Tests.isPositiveOrIsEven(0));

        assertTrue(Unit0Tests.isPositiveOrIsEven(1));
        assertTrue(Unit0Tests.isPositiveOrIsEven(2));
        assertTrue(Unit0Tests.isPositiveOrIsEven(3));
        assertTrue(Unit0Tests.isPositiveOrIsEven(4));
        assertTrue(Unit0Tests.isPositiveOrIsEven(5));
    }

    @Test
    public void testRepeatStringXTimes() throws Exception {
        assertEquals(Unit0Tests.repeatStringXTimes("foo", 20), "foofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoofoo");
        assertEquals(Unit0Tests.repeatStringXTimes("potato", 5), "potatopotatopotatopotatopotato");
        assertEquals(Unit0Tests.repeatStringXTimes("pumpkin", -1), "");
    }

    @Test
    public void testReturnStringUntilQ() throws Exception {
        assertEquals(Unit0Tests.returnStringUntilQ("ubiquitous"), "ubi");
        assertEquals(Unit0Tests.returnStringUntilQ("The quick brown fox"), "The ");
        assertEquals(Unit0Tests.returnStringUntilQ("Big July earthquakes confound zany experimental vow"), "Big July earth");
        assertEquals(Unit0Tests.returnStringUntilQ("hello"), "");
    }

    @Test
    public void testDeclareAndReturnPersonNamedAda() throws Exception {
        Person p = Unit0Tests.declareAndReturnPersonNamedAda();
        assertEquals(p.getName(), "Ada");
    }

    @Test
    public void testDeclareAndReturnPersonNamedTuringFromLondon() throws Exception {
        Person p = Unit0Tests.declareAndReturnPersonNamedTuringFromLondon();
        assertEquals(p.getName(), "Turing");
        assertTrue(p.getCity() instanceof Place);
        assertEquals(p.getCity().getName(), "London");
    }


    @Test
    public void testDeclareAndReturnPersonNamedGraceHopperFromVirginia() throws Exception {
        Person p = Unit0Tests.declareAndReturnPersonNamedGraceHopperFromArlingtonWithPhoneNumberUNIVAC();
        assertEquals(p.getName(), "Grace Hopper");
        assertTrue(p.getCity() instanceof Place);
        assertEquals(p.getCity().getName(), "Arlington");
        assertEquals(p.getPhoneNumber(), "UNIVAC");
    }

    @Test
    public void testIsFromLondon() throws Exception {
        Person p1 = Unit0Tests.declareAndReturnPersonNamedTuringFromLondon();
        Person p2 = Unit0Tests.declareAndReturnPersonNamedGraceHopperFromArlingtonWithPhoneNumberUNIVAC();
        assertTrue(Unit0Tests.isFromLondon(p1));
        assertFalse(Unit0Tests.isFromLondon(p2));
    }

    @Test
    public void testDeclareAndReturnArrayListOfThreePlaces() throws Exception {
        Object a = ArrayList.class;
        assertTrue(Unit0Tests.declareAndReturnArrayListOfThreePlaces() instanceof ArrayList);
        assertTrue(Unit0Tests.declareAndReturnArrayListOfThreePlaces().size() == 3);
        for (Object o : Unit0Tests.declareAndReturnArrayListOfThreePlaces()){
            assertTrue(o instanceof Place);
        }
    }

    @Test
    public void testDeclareAndReturnHashmapOfTuringAndHopper() throws Exception {
        assertTrue(Unit0Tests.declareAndReturnHashmapOfTuringAndHopper() instanceof HashMap);
        assertTrue(Unit0Tests.declareAndReturnHashmapOfTuringAndHopper().get("Turing") instanceof Person);
        assertTrue(Unit0Tests.declareAndReturnHashmapOfTuringAndHopper().get("Hopper") instanceof Person);
    }

    @Test
    public void testChangeTuringsAddressToPrinceton() throws Exception {
        HashMap<String, Person> people = Unit0Tests.declareAndReturnHashmapOfTuringAndHopper();
        assertEquals(people.get("Turing").getCity().getName(), "London");
        Unit0Tests.changeTuringsCityToPrinceton(people);
        assertEquals(people.get("Turing").getCity().getName(), "Princeton");
    }

    // bonus problems

    @Test
    public void testBonusPrintOutSumOfFirstTenFibonacciNumbers() throws Exception {
        Unit0Tests.bonusPrintOutSumOfFirstTenFibonacciNumbers();
        assertEquals("89\n", outContent.toString());
    }

    @Test
    public void testBonusPrintOutSumOfFirstFortyFibonacciNumbers() throws Exception {
        Unit0Tests.bonusPrintOutSumOfFirstFortyFibonacciNumbers();
        assertEquals("165580141\n", outContent.toString());
    }

}