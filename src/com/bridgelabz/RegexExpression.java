package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First name");
        String str1 = sc.next();
        System.out.println("Enter the last name");
        String str2 = sc.next();
        System.out.println("Enter the email ID  eg: xyz@abc.com");
        String str3 = sc.next();
        System.out.println("Enter the Phone number eg: 91 9090909090");
        String str4 = sc.next();
        System.out.println("Enter the password (Minimum 8 Characters)");
        String str5 = sc.next();

        boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).matches();
        boolean b2 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str2).matches();
        boolean b3 = Pattern.compile("^[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$").matcher(str3).matches();
        boolean b4 = Pattern.compile("^(91)[-.+]{1}[1-9]{1}[0-9]{9}$").matcher(str4).matches();
        boolean b5 = Pattern.compile("^[A-Z]{1}[a-zA-Z0-9]{7,}$").matcher(str5).matches();

        //Checking First name
        if (b1 == true){
            System.out.println("The first name is valid");
        }else
            System.err.println("The first name is Invalid");

        // Checking last name
        if (b2 == true){
            System.out.println("The last name is valid");
        }else
            System.err.println("The last name is Invalid");

        //Checking email ID
        if (b3 == true){
            System.out.println("The email ID is valid");
        }else
            System.err.println("The email ID is Invalid");

        //Checking Phone number
        if (b4 == true){
            System.out.println("The phone number is valid");
        }else
            System.err.println("The phone number is Invalid");

        //Checking password
        if (b5 == true){
            System.out.println("The password is valid");
        }else
            System.err.println("The password is Invalid");
    }
}


