package ru.yandex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PalindromeServiceTest {

    private final String checkedText;
    private final boolean expected;

    public PalindromeServiceTest(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {"anna", true},
                {"anka", false},
                {"q", true},
        };
    }


    @Test
    public void isPalindrome() {
        PalindromeService palindromeService = new PalindromeService();
        assertEquals(expected, palindromeService.isPalindrome(checkedText));
    }

}