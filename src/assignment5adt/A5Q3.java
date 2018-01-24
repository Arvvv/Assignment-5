package assignment5adt;

import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Owner
 */
public class A5Q3 {

    // creating char array
    private char[] array;

    private int numItems;

    public A5Q3() {
        array = new char[10];
    }

    public boolean inLang(String word) {
        // implementing stack
        Stack<Character> stack = new Stack<Character>();
        // if the word exists
        if (word.length() != 0) {
            // identifying the sign through a char 
            char dollarsign = '$';
            // if there isn't a dollar sign at the middle return false
            if (word.charAt(word.length() / 2) != dollarsign) {
                return false;
            }
            // if the word exceed one letter 
            if (word.length() > 1) {
                for (int i = 0; i < word.length(); i++) {
                    array[i] = word.charAt(i);
                }
            }
            if (array[0] == array[word.length() - 1]) {
                word = word.substring(1, word.length() - 1);
                return inLang(word);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
    public static void main (String[]args){
        A5Q3 test = new A5Q3();
        String word = "man$nam";

    }

}
