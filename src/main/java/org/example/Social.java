package org.example;
//Chapter 3
//Program 16
//Andrew Smiley
public class Social
{
    private String socialNum;
    public Social() {
    }
    public Social(String soc) {
        setSocial(soc);
    }
    public void setSocial(String w) {
        socialNum = w; //this sets the socialNum variable to the value of param w
    }
    public int chopAndAdd() {
        String first = socialNum.substring(0, socialNum.indexOf("-")); //this gets the string value of the first section
        String second = socialNum.substring(socialNum.indexOf("-")+1, socialNum.lastIndexOf("-"));
        String third = socialNum.substring(socialNum.lastIndexOf("-")+1);
        return Integer.parseInt(first)+Integer.parseInt(second)+Integer.parseInt(third); //this sums up the Integer values of the SSN parts.
    }
    public String toString() {
        return "SS# " + socialNum + " has a total of " + chopAndAdd(); //this returns a nicely formatted string to display the output.
    }
    public static void main(String[] args) {
        Social social = new Social("456-56-234");
        System.out.println(social);
        social.setSocial("1-1-1");
        System.out.println(social);
        social.setSocial("102-2-12");
        System.out.println(social);
        social.setSocial("0-0-0"); //this tests for the SSN "0-0-0"
        System.out.println(social);
    }
    /*
    SS# 456-56-234 has a total of 746
    SS# 1-1-1 has a total of 3
    SS# 102-2-12 has a total of 116
    SS# 0-0-0 has a total of 0
     */
}