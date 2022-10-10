package codeUp.day4;

import java.util.Scanner;

public class Main1040 {
    public static void main(String[] args) {
        // 입력된 정수의 부호를 바꿔 출력해보자.
        // 단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.printf("%d", -num);
    }
}
