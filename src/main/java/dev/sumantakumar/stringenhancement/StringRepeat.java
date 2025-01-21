package dev.sumantakumar.stringenhancement;

public class StringRepeat {
    public static void main(String[] args) {
        String string = "Hello World";

        System.out.println(string);


        System.out.println(string.repeat(0)); // Blank Line
        System.out.println(string.repeat(1)); // Hello World
        System.out.println(string.repeat(2)); // Hello WorldHelloWorld
        //System.out.println(string.repeat(-1)); // Exception
    }
}
