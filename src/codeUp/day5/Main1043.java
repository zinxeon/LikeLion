package codeUp.day5;

import java.util.Scanner;

public class Main1043 {
    public static void main(String[] args) {
        //정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
        // 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a % b);
    }
}
