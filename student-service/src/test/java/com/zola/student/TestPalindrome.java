package com.zola.student;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class TestPalindrome {

    @Test
    public void testCase1() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    public void testCase2() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void testCase3() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    public void testCase4() {
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testCase5() {
        assertTrue(PalindromeChecker.isPalindrome("No lemon, no melon"));
    }

    @Test
    public void testCase6() {
        assertTrue(PalindromeChecker.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void testCase7() {
        assertTrue(PalindromeChecker.isPalindrome("12321"));
    }

    @Test
    public void testCase8() {
        assertFalse(PalindromeChecker.isPalindrome("12345"));
    }

    @Test
    public void testCase9() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testCase10() {
        assertTrue(PalindromeChecker.isPalindrome(" "));
    }

    @Test
    public void testCase11() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }

    @Test
    public void testCase12() {
        assertFalse(PalindromeChecker.isPalindrome("ab"));
    }

    @Test
    public void testCase13() {
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
    }

    @Test
    public void testCase14() {
        assertTrue(PalindromeChecker.isPalindrome("Eva, can I see bees in a cave?"));
    }

    @Test
    public void testCase15() {
        assertTrue(PalindromeChecker.isPalindrome("Step on no pets!"));
    }

    @Test
    public void testCase16() {
        assertTrue(PalindromeChecker.isPalindrome("Top spot"));
    }

    @Test
    public void testCase17() {
        assertFalse(PalindromeChecker.isPalindrome("Not a palindrome"));
    }

    @Test
    public void testCase18() {
        assertTrue(PalindromeChecker.isPalindrome("Mr. Owl ate my metal worm"));
    }

    @Test
    public void testCase19() {
        assertTrue(PalindromeChecker.isPalindrome("Too hot to hoot"));
    }

    @Test
    public void testCase20() {
        assertTrue(PalindromeChecker.isPalindrome("Never odd or even"));
    }
}
