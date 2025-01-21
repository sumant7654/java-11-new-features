package dev.sumantakumar.stringenhancement;

public class StingStrip {
    public static void main(String[] args) {
        String greeting = "     Hello World!      ";
        System.out.println(greeting);
        System.out.println(greeting.trim());
        System.out.println(greeting.replaceAll(" ", ""));
        System.out.println(greeting.strip());
        System.out.println(greeting.stripLeading());
        System.out.println(greeting.stripTrailing());
    }
}
