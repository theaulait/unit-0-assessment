package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods

      printHelloWorld();
    }

    public static void printHelloWorld() {
      System.out.println("");
    }

    public static Object returnPrimitiveBooleanTrue() {
      return null;
    }

    public static Object returnPrimitiveInt1729() {
      return null;
    }

    public static Object returnPrimitiveDoubleThreePointOneFour() {
      return null;
    }

    public static Object returnPrimitiveCharZ() {
      return null;
    }

    public static void printSumOf1Upto10UsingForLoop() {

    }

    public static void printSumOf1Upto10000UsingForLoop() {

    }

    public static boolean isOdd(int n) {
      return false;
    }

    public static boolean isNotOdd(int n) {
      return false;
    }

    public static boolean isMultipleOfThree(int n) {
      return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
      return false;
    }

    public static boolean isPositive(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPositiveOrIsEven(int n){
      return false;
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return null;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        return null;
    }

    public static Person declareAndReturnPersonNamedAda() {
      return null;
    }

    public static Person declareAndReturnPersonNamedTuringFromLondon() {
      return null;
    }

    public static Person declareAndReturnPersonNamedGraceHopperFromArlingtonWithPhoneNumberUNIVAC() {
        // FIXME This person needs a name, a city, and a phone number with the value of "UNIVAC"
        return null;
    }

    public static boolean isFromLondon(Person person) {
      return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
      return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfTuringAndHopper() {
      return null;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {

    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
