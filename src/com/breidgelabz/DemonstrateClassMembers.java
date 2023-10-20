package com.breidgelabz;

/*
 Write a Algorithm to demonstrate static variables, methods, and blocks

 Step 1: Start
 Step 2: Declare a static variable var1
 Step 3: Initialize var1
 Step 4: Declare a concrete method
 Step 5: Declare a block to display message
 Step 6: Display static variable
 Step 7: call Static method and display message
 Step 8: Stop

*/

public class DemonstrateClassMembers {

    // Static variable
    static int var1 = 356;

    // method
    public static int method(){
        return var1;
    }

    // blocks
    static {
        System.out.println("hello!!!");
    }

    public static void main(String[] args) {
        System.out.println("Static variable var1 : "+var1);
        System.out.println("call method function : "+method());

    }
}
