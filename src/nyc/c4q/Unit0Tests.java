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
      System.out.println("Hello World");
    }

    public static Object returnPrimitiveBooleanTrue() {

        return true;
    }

    public static int returnPrimitiveInt1729() {
        int number = 1729;

        return number;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
        Double number = 3.14;

        return number;
    }

    public static Object returnPrimitiveCharZ() {
        return false;
    }


    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for(int i = 1; i < 10;){
            sum +=i;
            i++;

            System.out.println(sum);
        }
    }

    public static void printSumOf1Upto10000UsingForLoop() {
         int sum = 0;
        for(int i = 1; i<10000;){
            sum +=i;
            i++;

            System.out.println(sum);
        }

    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0)
        {

        } return true;
    }

    public static boolean isMultipleOfThree(int n) {
       if (n % 3 == 0){

       }return true;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if((n % 2 !=0) && (n%3 == 0)){

        }return true;
    }

    public static String repeatStringXTimes(String input, int times) {
        String result = "";
        for (int i = 0; i<=times; i++){
            result += input;
        }
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return result;
    }

    public static String returnStringUntilQ(String input) {
        String output1 = input.toLowerCase();
        String output2 = output1.substring(0, input.indexOf("q"));
        if (!output1.contains("q")){
            return "";
        }
        else
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        return output2;
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person Ada = new Person();

        return Ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
      Person Alan = new Person();
        Alan.setCity("London");

        return Alan;
    }

    public static boolean isFromLondon(Person person) {
      if(person.getCity().equalsIgnoreCase("London")){

      }return true;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        Place Florida = new Place();
        Place California = new Place();
        Place Texas = new Place();

        ArrayList<Place> destination = new ArrayList<Place>();
        destination.set(0, Florida);
        destination.set(1, California);
        destination.set(2, Texas);

        return destination;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {

        HashMap<String, Person> people = new HashMap<String, Person>();

      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
      return people;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
