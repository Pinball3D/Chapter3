package org.example;
//Chapter 3
//Program 15
//Andrew Smiley
public class WordsCompare {
    private String wordOne, wordTwo;
    private int compare;

    public WordsCompare(){
    }
    public WordsCompare(String one, String two){
        setWords(one, two);
    }
    public void setWords(String one, String two){
        wordOne = one; //this sets wordOne to the value of the parameter one
        wordTwo = two;
    }
    public int compare(){
        return wordOne.compareTo(wordTwo); //this returns the value of calling the compare method on wordOne.
    }
    public String toString(){
        if (compare() < 0) {
            return wordOne + " should be placed before " + wordTwo + "\n";
        } else if (compare() > 0) {
            return wordTwo + " should be placed before " + wordOne + "\n";
        } else{
            return wordOne + " is equal to " + wordTwo + "\n";
        }
    }
    public static void main(String [] args){
        WordsCompare test = new WordsCompare("abe", "ape");
        System.out.println(test); //this prints the output of test.toString();
        test.setWords("Giraffe", "Gorilla");
        System.out.println(test);
        test.setWords("One", "Two");
        System.out.println(test);
        test.setWords("fun", "funny");
        System.out.println(test);
        test.setWords("123", "19");
        System.out.println(test);
        test.setWords("193", "1910");
        System.out.println(test);
        test.setWords("goofy", "godfather");
        System.out.println(test);
        test.setWords("funnel", "fun");
        System.out.println(test);
        test.setWords("Hello", "Hello");
        System.out.println(test);

    }
    /*
    abe should be placed before ape

    Giraffe should be placed before Gorilla

    One should be placed before Two

    fun should be placed before funny

    123 should be placed before 19

    1910 should be placed before 193

    godfather should be placed before goofy

    fun should be placed before funnel

    Hello is equal to Hello

     */
}
