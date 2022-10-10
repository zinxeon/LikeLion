package codeUp.day4;

import java.util.Scanner;

public class Main1039 {
    public static void main(String[] args) {
        // 정수 2개를 입력받아 합을 출력해보자.
        // 단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
        Scanner s = new Scanner(System.in);
        long num1 = s.nextLong();
        long num2 = s.nextLong();

        System.out.println(num1 + num2);
    }
}
