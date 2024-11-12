package org.example;
//Chapter 3
//Program 13
//Andrew Smiley

import java.util.Scanner;

public class CharacterAnalyzer {
    private char theChar;
    public CharacterAnalyzer() {
    }
    public CharacterAnalyzer(char c){
        setChar(c);
    }
    public void setChar(char c){
        theChar = c;
    }
    public char getChar() {
        return theChar;
    }
    public boolean isUpper() {
        return getASCII() <= 96 && getASCII() >= 65;
    }
    public boolean isLower() {
        return getASCII() >= 97;
    }
    public boolean isNumber() {
        return getASCII() >= 48 && getASCII() <= 64;
    }
    public int getASCII() {
        return (int) getChar();
    }
    public String toString() {
        String ASCII = " ASCII is " + getASCII();
        if (isUpper()) {
            return getChar() + " is an uppercase letter." + ASCII;
        } else if (isLower()) {
            return getChar() + " is a lowercase letter." + ASCII;
        } else {
            return getChar() + " is a number." + ASCII;
        }
    }
    public static void main (String args []) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String userInput = keyboard.next();
        CharacterAnalyzer characterAnalyzer = new CharacterAnalyzer(userInput.charAt(0)); //this is getting the first character from the users input and initializing an instance of the CharacterAnalyzer class.
        System.out.println(characterAnalyzer);
        characterAnalyzer.setChar('1');
        System.out.println(characterAnalyzer);
        characterAnalyzer.setChar('a');
        System.out.println(characterAnalyzer);
        characterAnalyzer.setChar('7');
        System.out.println(characterAnalyzer);
        characterAnalyzer.setChar('D');
        System.out.println(characterAnalyzer);
        characterAnalyzer.setChar('2');
        System.out.println(characterAnalyzer);
        characterAnalyzer.setChar('X');
        System.out.println(characterAnalyzer);
        characterAnalyzer.setChar('Z');
        System.out.println(characterAnalyzer);
        characterAnalyzer.setChar('9');
        System.out.println(characterAnalyzer);
    }
    /*
    OUTPUT:
    Enter a character: A
    A is an uppercase letter. ASCII is 65
    1 is a number. ASCII is 49
    a is a lowercase letter. ASCII is 97
    7 is a number. ASCII is 55
    D is an uppercase letter. ASCII is 68
    2 is a number. ASCII is 50
    X is an uppercase letter. ASCII is 88
    Z is an uppercase letter. ASCII is 90
    9 is a number. ASCII is 57
     */
}