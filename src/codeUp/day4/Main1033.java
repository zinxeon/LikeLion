package codeUp.day4;

import java.util.Scanner;

public class Main1033 {
    public static void main(String[] args) {
        // 10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
        Scanner s = new Scanner(System.in);
        int hex = s.nextInt();

        System.out.printf("%X", hex);
    }
}
