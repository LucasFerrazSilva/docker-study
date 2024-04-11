package com.ferraz.dockerstudy.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {


    @Test
    void isPalindrome() {
        // Given
        PalindromeService service = new PalindromeService();
        String validPalindrome = "abcba";
        String invalidPalindrome = "abcb";

        // When
        boolean isPalindrome1 = service.isPalindrome(validPalindrome);
        boolean isPalindrome2 = service.isPalindrome(invalidPalindrome);

        // Then
        assertThat(isPalindrome1).isTrue();
        assertThat(isPalindrome2).isFalse();
    }

    @Test
    void revert() {
        // Given
        PalindromeService service = new PalindromeService();
        String string1 = "abcba";
        String string2 = "abcb";

        // When
        String revertedString1 = service.revert(string1);
        String revertedString2 = service.revert(string2);

        // Then
        assertThat(revertedString1).isEqualTo(string1);
        assertThat(revertedString2).isEqualTo("bcba");
    }
}