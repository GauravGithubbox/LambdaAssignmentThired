package com.knoldus;


import java.util.logging.Logger;

public final class StringController {
    public static final Logger LOGGER = Logger.getLogger(StringController.class.getName());

    private StringController(){}

    public static void main(String[] args)
    {
         String str1 = "The";
         String str2 = "lambda";
         String str3 = "has";
         String str4 = "too";
         String str5 = "many";
         String str6 = "string";
         String str7 = "arguments";

        StringTooUpper capitalizeStrings = new StringTooUpper();
        String result = capitalizeStrings.toUpper(str1, str2, str3, str4, str5, str6, str7);
        System.out.println(result);
    }
}