package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(parseNumberToWords(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String parseNumberToWords(int num) {
        if ((num+"").indexOf('3') != -1) {
            return "Fizz";
        }
        String result = "";
        if (num % 3 == 0) {
            result += "Fizz";
        }
        if (num % 5 == 0) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if ("".equals(result)) {
            return num + "";
        } else {
            return result;
        }
    }
}


