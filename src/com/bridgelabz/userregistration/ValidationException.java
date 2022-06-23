package com.bridgelabz.userregistration;

public class ValidationException extends Exception {
    public enum ExceptionType{
        INVALID_NAME,
        INVALID_EMAIL,
        INVALID_PHONE_NUMBER,
        INVALID_PASSWORD
    }
   public ExceptionType type;
    public ValidationException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
