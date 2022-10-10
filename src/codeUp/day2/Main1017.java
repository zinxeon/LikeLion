package codeUp;

import java.util.Scanner;

public class Main1017 {
    public static void main(String[] args) {
//        int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        System.out.printf("%d %d %d", num, num, num);
    }
}
