package codeUp.day2;

import java.util.Scanner;

public class Main1019 {
    public static void main(String[] args) {
//        년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자
        Scanner s = new Scanner(System.in);

        String input = s.next();
        String[] arr = input.split("[.]");

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
