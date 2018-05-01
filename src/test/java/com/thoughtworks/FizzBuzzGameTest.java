package com.thoughtworks;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzGameTest {

    FizzBuzzGame game = new FizzBuzzGame();

    @Test
    public void should_return_Fizz_when_have_3() {
        game.start(14);
        List<String> excepted = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","Whizz","8","Fizz","Buzz","11","Fizz","Fizz","Whizz");

        assertThat(game.getResults(),equalTo(excepted));
    }

    @Test
    public void should_return_FizzBuzz_when_could_be_divided_by_3_and_5() {
        String excepted = "FizzBuzz";

        assertThat(game.parseNumberToWords(15), equalTo(excepted));

    }

    @Test
    public void should_return_FizzBuzzWhizz_when_could_be_divided_by_3_5_and_7_but_not_contains_3() {
        String excepted = "FizzBuzzWhizz";
        assertThat(game.parseNumberToWords(105),equalTo(excepted));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_could_be_divided_by_3_5_and_7_but_contains_3() {
        String excepted = "Fizz";
        assertThat(game.parseNumberToWords(315),equalTo(excepted));
    }
}
