package codeUp.day5;

import java.util.Scanner;

public class Main1046 {
    public static void main(String[] args) {
        // 정수 3개를 입력받아 합과 평균을 출력해보자.
        //단, -2147483648 ~ +2147483647
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((long)a+b+c);    // 합
        System.out.printf("%.1f", (float)(a+b+c)/3);   // 평균
    }
}
