package org.example;

public class Main {
    public static void main(String[] args) {
        Typo typo = () -> "hello world";
        Test test = new Test();
        test.test(typo);
        System.out.println(typo.typpo());
    }
}
