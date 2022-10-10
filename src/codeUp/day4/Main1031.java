package codeUp.day4;

import java.util.Scanner;

public class Main1031 {
    public static void main(String[] args) {
        // 10진수를 입력받아 8진수(octal)로 출력해보자.
        Scanner s = new Scanner(System.in);
        int oct = s.nextInt();

        System.out.printf("%o", oct);
    }
}
