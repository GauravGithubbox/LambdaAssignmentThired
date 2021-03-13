package com.knoldus;

public class StringTooUpper implements CapitalizeStrings {


    @Override
    public String toUpper(String str1, String str2, String str3, String str4, String str5, String str6,
                          String str7) {

            CapitalizeStrings func = (s1, s2, s3, s4, s5, s6, s7) -> s1.toUpperCase() + s2.toUpperCase() +
                    s3.toUpperCase() + s4.toUpperCase() + s5.toUpperCase() + s6.toUpperCase() + s7.toUpperCase();

            return func.toUpper(str1, str2, str3, str4, str5, str6, str7);


        }
}
