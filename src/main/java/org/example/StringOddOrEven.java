package org.example;
//Chapter 3
//Program 14
//Andrew Smiley
import java.util.Scanner;

public class StringOddOrEven {
    private String word;
    public StringOddOrEven() {
    }
    public StringOddOrEven(String s) {
        setString(s); //this is an initialization constructor which calls the setString method on parameter s.
    }
    public void setString(String s) {
        word = s; //this sets the word to the parameter s.
    }
    public boolean isEven() {
        return (word.length() % 2) == 0; //this determines if the word is evenly divisible by two.
    }
    public String toString() {
        if (isEven()) {
            return word + " is even."; //this is returned when the string has an even length.
        }
        return word + " is odd.";
    }
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput = keyboard.next();
        StringOddOrEven test = new StringOddOrEven(userInput);
        System.out.println(test);
        test.setString("cat");
        System.out.println(test);
        test.setString("boot");
        System.out.println(test);
        test.setString("it");
        System.out.println(test);
        test.setString("a");
        System.out.println(test);
        test.setString("eleven");
        System.out.println(test);
        test.setString("thirteen");
        System.out.println(test);
        test.setString("odd");
        System.out.println(test);
        test.setString("even");
    }
    /*
    Enter a word: test
    test is even.
    cat is odd.
    boot is even.
    it is even.
    a is odd.
    eleven is even.
    thirteen is even.
    odd is odd.
     */
}
