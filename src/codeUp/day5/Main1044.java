package codeUp.day5;

import java.util.Scanner;

public class Main1044 {
    public static void main(String[] args) {
        //정수를 1개 입력받아 1만큼 더해 출력해보자.
        // 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((long)a +1);
    }
}
