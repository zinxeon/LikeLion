package codeUp.day5;

import java.util.Scanner;

public class Main1045 {
    public static void main(String[] args) {
        // 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
        // 단 0 <= a, b <= 2147483647, b는 0이 아니다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);   // 합
        System.out.println(a - b);   // 차
        System.out.println(a * b);   // 곱
        System.out.println(a / b);   // 몫
        System.out.println(a % b);   // 나머지
        System.out.printf("%.2f", (float)a / b);   // 나눈 값 순서대로 출력 (소수점 이하 셋째 자리 반올림)
    }
}
