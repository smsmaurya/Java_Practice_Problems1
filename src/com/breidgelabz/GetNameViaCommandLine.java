package com.breidgelabz;

/*
To get the name using the command line

Step 1: Start
Step 2: Declare a  String variable name
Step 3: Read variable name
Step 4: Display name
Step 5: Stop
*/

import java.util.Scanner;

public class GetNameViaCommandLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
    }
}
