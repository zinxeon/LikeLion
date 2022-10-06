package codeUp.day3;

import java.util.Scanner;

public class Main1029 {
    public static void main(String[] args) {
        // 실수 1개를 입력받아 그대로 출력해보자.
        // (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();

        System.out.printf("%.11f", num);
    }
}
