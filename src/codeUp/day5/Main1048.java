package codeUp.day5;

import java.util.Scanner;

public class Main1048 {
    public static void main(String[] args) {
        // 정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
        // 0 <= a <= 10, 0 <= b <= 10
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", a << b);
    }
}
