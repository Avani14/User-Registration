package com.bridgelabz.userregistration;

import java.io.IOException;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public void check(boolean ans) {
        if (ans) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }

    //Name validation which works for first and last name
    public boolean nameValidation(String name) throws ValidationException {
        Predicate<String> nameValidation = (x) -> {
        String regex = "^[A-Z]{1}+[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        check(m.find());
            if (m.matches()) {
                return true;
            }
            return false;
        };
        if (nameValidation.test(name)) {
            return true;
        } else {
            throw new ValidationException(ValidationException.ExceptionType.INVALID_NAME, "Please enter valid name.");

        }
    }

    //Email validation
    public boolean emailValidation(String email) throws ValidationException {
        Predicate<String> emailId = (x) -> {
            String regex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(email);
            check(m.find());
            if (m.matches()) {
                return true;
            }
            return false;
        };
        if (emailId.test(email)) {
            return true;
        } else {
            throw new ValidationException(ValidationException.ExceptionType.INVALID_EMAIL, "Please enter valid email.");

        }

    }

    //Phone number validation
    public boolean phoneNumberValidation(String phone) throws ValidationException {
        Predicate<String> phoneNumber = (x) -> {
            String regex = "^(91|0)?+[7-9]{1}+[0-9]{9}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            check(m.find());
            if (m.matches()) {
                return true;
            }
            return false;
        };
        if (phoneNumber.test(phone)) {
            return true;
        } else {
            throw new ValidationException(ValidationException.ExceptionType.INVALID_PHONE_NUMBER, "Please enter valid phone number.");

        }
    }

    //Password validation
    public boolean passwordValidation(String password) throws ValidationException {
        Predicate<String> pass = (x) -> {
            String regex = "[A-Z]{1,}[a-z0-9!@#&()–[{}]:;',?/*~$^+=<>]{7,}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(password);
            check(m.find());
            if (m.matches()) {
                return true;
            }
            return false;
        };
        if (pass.test(password)) {
            return true;
        } else {
            throw new ValidationException(ValidationException.ExceptionType.INVALID_PASSWORD, "Please enter valid Password.");

        }
    }
}
