package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws ValidationException {

        System.out.println("---Welcome to User Registration---");
        Validation v = new Validation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String f_name = sc.next();
        try {
            v.nameValidation(f_name);
        }
        catch (ValidationException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter first name: ");
            f_name = sc.next();
        }
        System.out.println("Please enter last name: ");
        String l_name = sc.next();
        try {
            v.nameValidation(l_name);
        }
        catch (ValidationException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter last name: ");
            l_name = sc.next();
        }
        System.out.println("Please enter your 10 digit phone number: ");
        String phone = sc.next();
        try {
            v.phoneNumberValidation(phone);
        }
        catch (ValidationException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter your 10 digit phone number: ");
            phone = sc.next();
        }
        System.out.println("Please enter your password(it should be of minimum length 8): ");
        String password = sc.next();
        try {
            v.passwordValidation(password);
        }
        catch (ValidationException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter your password(it should be of minimum length 8): ");
            password = sc.next();
        }
        System.out.println("Thank You!!");
    }
}