package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.Validation;
import com.bridgelabz.userregistration.ValidationException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    private String email;
    private boolean expectedResult;
    public EmailValidationTest(String email,boolean expectedResult)
    {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {"abc@gmail.com.aa.au",false},
                {"abc@gmail.com.1a",false},
                {"abc@abc@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc..2002@gmail.com",false},
                {"abc@%*.com",false},
                {"abc()*@gmail.com",false},
                {".abc@abc.com",false},
                {"abc123@.com.com",false},
                {"abc123@.com",false},
                {"abc123@gmail.a",false},
                {"abc@.com.my",false},
                {"abc",false}
        });
    }
    @Test
    public void emailValidation() throws ValidationException {
        try {
            Validation v = new Validation();
            v.emailValidation(this.email);
        }
        catch (ValidationException v) {
                Assertions.assertEquals(ValidationException.ExceptionType.INVALID_EMAIL, v.type);
        }
    }
}