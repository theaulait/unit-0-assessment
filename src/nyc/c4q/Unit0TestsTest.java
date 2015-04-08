package nyc.c4q;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Unit0TestsTest {

    // http://stackoverflow.com/a/1119559/198348
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
//        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
//        System.setErr(null);
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
        assertEquals((double) Unit0Tests.returnPrimitiveDoubleThreePointOneFour(), 3.14, 0.01);
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
    public void testPrintSumOf1Upto100000UsingForLoop() throws Exception {
        Unit0Tests.printSumOf1Upto100000UsingForLoop();
        assertEquals("4999950000\n", outContent.toString());
    }

    @Test
    public void testIsEven() throws Exception {
        assertTrue(Unit0Tests.isEven(0));
        assertFalse(Unit0Tests.isEven(1));
        assertTrue(Unit0Tests.isEven(2));
        assertFalse(Unit0Tests.isEven(3));
        assertTrue(Unit0Tests.isEven(4));
        assertFalse(Unit0Tests.isEven(5));
        assertTrue(Unit0Tests.isEven(6));
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
    public void testDeclareAndReturnPersonNamedAda() throws Exception {
        Person p = Unit0Tests.declareAndReturnPersonNamedAda();
        assertEquals(p.getName(), "Ada");
    }

    @Test
    public void testDeclareAndReturnPersonNamedTuringFromLondon() throws Exception {
        Person p = Unit0Tests.declareAndReturnPersonNamedTuringFromLondon();
        assertEquals(p.getName(), "Turing");
        assertEquals(p.getCity(), "London");
    }


    @Test
    public void testDeclareAndReturnPersonNamedGraceHopperFromVirginia() throws Exception {
        Person p = Unit0Tests.declareAndReturnPersonNamedGraceHopperFromArlingtonWithPhoneNumberUNIVAC();
        assertEquals(p.getName(), "Grace Hopper");
        assertEquals(p.getCity(), "Arlington");
        assertEquals(p.getPhoneNumber(), "UNIVAC");
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