package com.breidgelabz;

/*
Write a CheckLeapYear.java program and Algorithm that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

Step 1: Start
Step 2: Declare  a variable year
Step 3: read the value of year
Step 4: If (year%4==0 && year%100!=0) || year%400==0
           Display 'year' is a leap year
        Else
           Display 'year' is not leap year
Step 5: Stop

*/


import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int year = sc.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+" is a Leap year");
        }
        else {
            System.out.println(year+" is not Leap year");
        }
    }
}
