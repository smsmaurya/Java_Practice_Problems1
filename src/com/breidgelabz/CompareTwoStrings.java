package com.breidgelabz;

/*
Algo of check two strings are equal or not.

step 1: Start
step 2: declare string variables string1 and string2
step 3: initialize value of string1 and string2
step 4: If [string1.equals(string2)]
          Display string1 and string2 are equals
        Else
          Display string1 and string2 are not equals
step 5: Stop
*/

public class CompareTwoStrings {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        if(string2.equals(string1)){
            System.out.println("both strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
