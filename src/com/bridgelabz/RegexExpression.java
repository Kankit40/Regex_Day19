package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExpression {
    //Rules of validation
    public static boolean checkValidName(String firstName) {
        String firstNameRegex= "^[A-Z]{1}[A-Za-z]{2,}$";
        Pattern obj= Pattern.compile(firstNameRegex);

        if(firstName==null) {
            return false;

        }
        Matcher obj2 = obj.matcher(firstName);
        return obj2.matches();
    }
    public static void main(String[] args) {

        System.out.println("----- Welcome To Name Validator -----");

        String firstName ="Ankit";
        boolean isfirstName = checkValidName(firstName);

        if(isfirstName)
            System.out.println(firstName+" is an Valid firstName");
        else
            System.out.println(firstName+" is an Invalid firstName");
    }
}
