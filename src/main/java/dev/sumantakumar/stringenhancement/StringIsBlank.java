package dev.sumantakumar.stringenhancement;

public class StringIsBlank {
    public static void main(String[] args) {
        String s = "";
        String t = " ";
        var a = "";
        var b = " ";

        System.out.println(s.isEmpty());
        System.out.println(t.isBlank());

        System.out.println(t.isEmpty());
        System.out.println(t.isBlank());

        System.out.println(a.isEmpty());
        System.out.println(a.isBlank());

        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

    }
}
