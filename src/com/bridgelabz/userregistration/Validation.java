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
    public boolean nameValidation(String name)
    {
        String regex ="^[A-Z]{1}+[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        check(m.find());
        return m.matches();
    }
    //Email validation
    public boolean emailValidation(String email)
    {
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        check(m.find());
        return m.matches();
    }
    //Phone number validation
    public boolean phoneNumberValidation(String phone)
    {

        String regex = "^(91|0)?+[7-9]{1}+[0-9]{9}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);
        check(m.find());
        return m.matches();
    }
    //Password validation
    public boolean passwordValidation(String password)
    {
        //This is for rule 4
        String regex = "[A-Z]{1,}[a-z0-9!@#&()–[{}]:;',?/*~$^+=<>]{7,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        check(m.find());
        return m.matches();
    }
}
