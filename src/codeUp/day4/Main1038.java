package codeUp.day4;

import java.util.Scanner;

public class Main1038 {
    public static void main(String[] args) {
        // 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
        // (단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
        Scanner s = new Scanner(System.in);
        long num1 = s.nextLong();
        long num2 = s.nextLong();

        System.out.println(num1 + num2);
    }
}
