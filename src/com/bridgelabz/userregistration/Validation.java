package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public void check(boolean ans)
    {
        if(ans)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Not valid");
        }
    }
    //Name validation which works for first and last name
    public void nameValidation(String name)
    {
        String regex ="^[A-Z]{1}+[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        check(m.find());
    }
    //Email validation
    public void emailValidation(String email)
    {
        String regex = "^[abc]{1}(.*[A-Za-z0-9-_+.])?@{1}[A-Za-z0-9]{1,}.com{1}(.[a-z]*)?$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        check(m.find());
    }
    //Phone number validation
    public void phoneNumberValidation(String phone)
    {

        String regex = "^(91|0)?+[7-9]{1}+[0-9]{9}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);
        check(m.find());
    }
    //Password validation
    public void passwordValidation(String password)
    {
        //This is for rule 4
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{1}?[@#$%^&-+=()])(?=.*[a-zA-Z0-9]*).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        check(m.find());
    }
}
