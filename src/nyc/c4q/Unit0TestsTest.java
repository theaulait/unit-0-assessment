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
        Person p = Unit0Tests.declareAndReturnPersonNamedGraceHopperFromVirginia();
        assertEquals(p.getName(), "Grace Hopper");
        assertEquals(p.getCity(), "Virginia");
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