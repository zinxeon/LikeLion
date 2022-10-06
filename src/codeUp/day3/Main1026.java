package codeUp.day3;

import java.util.Scanner;

public class Main1026 {
    public static void main(String[] args) {
        // 입력되는 시:분:초 에서 분만 출력해보자.
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String[] arr = str.split(":");
        System.out.println(Integer.parseInt(arr[1]));
    }
}
