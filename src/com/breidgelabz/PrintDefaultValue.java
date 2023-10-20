package com.breidgelabz;

/*
Algorithm to display the default value of all primitive data types

Step 1: Start
Step 2: declare all primitive data type variables
step 3: Display all variables
step 4: Stop

*/

public class PrintDefaultValue {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bl;
    static char ch;
    public static void main(String[] args) {


        System.out.println("default value of 'byte' is :"+ b +
                "\ndefault value of 'short' is :"+ s +
                "\ndefault value of 'int' is : "+ i +
                "\ndefault value of 'long' is : "+ l +
                "\ndefault value of 'float' is : "+ f +
                "\ndefault value of 'double' is : "+ d +
                "\ndefault value of 'boolean' is : "+ bl +
                "\ndefault value of 'char' is : "+ ch
        );
    }
}
