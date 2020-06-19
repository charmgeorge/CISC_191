//Write a recursive method that finds the number of occurrences of a specified character in an array. You need to define the following two methods. The second one is a recursive helper method.
//
//public static int count(char[] chars, char ch)
//public static int count(char[] chars, char ch, int high)
//
//Write a test program that prompts the user to enter a list of characters in one line, and a character, and displays the number of occurrences of the character in the list.
//
//﻿Sample Run
//
//Enter a string: Welcome to Java
//
//Enter a character: e
//
//e appears 2 times

package exercise18_17;
import java.util.Scanner;

public class Exercise18_17 {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    System.out.print("Enter a character: ");
    char ch = input.next().charAt(0);

    char[] chars = s.replaceAll(" ", "").toCharArray();
    System.out.println( ch + " appears " + count(chars, ch) + " times");
    }

    public static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[] chars, char ch, int high) {
        if (high < 0) // Base case
                return 0;
        else if (chars[high] == ch) 
                return 1 + count(chars, ch, high - 1); 
        else
                return count(chars, ch, high - 1); 
	}

}