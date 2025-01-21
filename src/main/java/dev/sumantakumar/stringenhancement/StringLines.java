package dev.sumantakumar.stringenhancement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringLines {
    public static void main(String[] args) {
        String string = "Hello\nWorld!\nHow\nare\nyou?";

        System.out.println(string);

        Stream<String> lines = string.lines();
        List<String> collect = lines.collect(Collectors.toList());

        System.out.println(collect);
    }
}
