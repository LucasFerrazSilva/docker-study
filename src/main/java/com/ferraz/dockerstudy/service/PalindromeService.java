package com.ferraz.dockerstudy.service;

public class PalindromeService {

    public boolean isPalindrome(String input) {
        if (input == null)
            throw new IllegalArgumentException("Input cannot be null");

        String revertedString = revert(input);

        return input.equals(revertedString);
    }

    public String revert(String input) {
        String reverted = "";

        for(char ch: input.toCharArray()) {
            reverted = ch + reverted;
        }

        return reverted;
    }

}
