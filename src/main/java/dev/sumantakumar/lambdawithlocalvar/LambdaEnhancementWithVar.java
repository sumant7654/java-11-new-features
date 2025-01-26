package dev.sumantakumar.lambdawithlocalvar;

public class LambdaEnhancementWithVar {
    public static void main(String[] args) {
        Addition addition = (var a, var b) ->  a+b;
        int add = addition.add(100, 200);
        System.out.println("Addition: " + add);
    }
}


interface Addition{
    int add(int num1, int num2);
}
