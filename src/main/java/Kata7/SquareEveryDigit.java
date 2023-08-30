package Kata7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEveryDigit {

    public static void main(String[] args) {
      squareDigits(10);
    }

    public static int squareDigits(int n) {
        return Integer.parseInt( Arrays.stream(Integer.toString(n).split("")).map(number -> (int) Math.pow( Integer.parseInt(number), 2.0) ).map(String::valueOf).collect(Collectors.joining("")));
    }
}
