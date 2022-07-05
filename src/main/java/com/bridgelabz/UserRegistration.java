package com.bridgelabz;

public class UserRegistration {
    private static final String nameFormat = "[A-Z][a-z]{2,}";
    private static final String emailFormat = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
    private static final String mobileFormat = "^[0-9]{1,2}[ ][0-9]{10}$";
    private static final String passwordFormat = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$";


    public String checkFName(String fName) throws InvalidDetailExceptions {
        try {
            if (fName.matches(nameFormat)) {
                return "Success";
            } else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
            }
        } catch (NullPointerException e) {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }

    public String checkLName(String lName) throws InvalidDetailExceptions {
        try {
            if (lName.matches(nameFormat)) {
                return "Success";
            } else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide specific formate");
            }
        } catch (NullPointerException e) {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }

    }

    public String checkEmail(String emailId) throws InvalidDetailExceptions {
        try {
            if (emailId.matches(emailFormat)) {
                return "Success";
            } else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide specific email");
            }
        } catch (NullPointerException e) {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Don't provide null value");
        }
    }

    public String checkPhoneNumber(String phoneNo) throws InvalidDetailExceptions {
        try {
            if (phoneNo.matches(mobileFormat)) {
                return "Success";
            } else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide specific phone number");
            }
        } catch (NullPointerException e) {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }

    public String checkPassword(String passcode) throws InvalidDetailExceptions {
        try {
            if (passcode.matches(passwordFormat)) {
                return "Success";
            } else {
                throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please Provide specific password");
            }
        } catch (NullPointerException e) {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't provide null Value");
        }
    }

    public String moodAnalyse(String fName, String lName, String phoneNumber, String email, String password) throws InvalidDetailExceptions {
        try {
            if (checkFName(fName) == "Success" && checkLName(lName) == "Success" && checkEmail(email) == "Success" && checkPhoneNumber(phoneNumber) == "Success" && checkPassword(password) == "Success") {
                return "HAPPY";
            } else {
                return "SAD";
            }
        } catch (NullPointerException e) {
            throw new InvalidDetailExceptions(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }

    }

}


