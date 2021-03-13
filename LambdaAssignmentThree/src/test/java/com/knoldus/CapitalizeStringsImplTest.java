package com.knoldus;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CapitalizeStringsImplTest {

    @Test
    public void PositiveTestint() {
        String Exceptected="THELAMBDAHASTOOMANYSTRINGARGUMENTS" ;
        StringTooUpper capitalizeStrings = new StringTooUpper();
        String result = capitalizeStrings.toUpper("The", "lambda",  "has",  "too", "many", "string","arguments");
        assertEquals(Exceptected,result  );
    }

    @Test
    public void NegativeTesting() {
        String Exceptected="THE LAMBDA HAS TO0 MANY STRING ARGUMENTS" ;
        StringTooUpper capitalizeStrings = new StringTooUpper();
        String result = capitalizeStrings.toUpper("The", "lambda",  "has",  "too", "many", "string","arguments");
        assertNotEquals(Exceptected,result );
    }
}