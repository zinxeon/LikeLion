package likeLion.week4.day1014;

import java.util.Arrays;

public class InsertionSort02 {
    // 메서드
    public int[] sort(int[] arr, int i) { // 배열을 구분하다 // int i 넣는이유 : 재귀(recursive) 때문
        // 재귀 -- 반복문(while) 없이 반복해야 할 때
        // i = 1 arr[1] j vs arr[0]
        // i = 2 일 때 arr[2] j vs arr[1]
        // i = 2 일 때 arr[1] j vs arr[0]
        int j= i;
        if(arr[j] < arr[j-1]) {
            // indext의 값을 비교 후 자리를 바꾼다.
            // {8, 5, 6, 2, 4} -> {5, 8, 6, 2, 4}
            int temp = arr[j]; // int타입의 temp 변수 선언과 동시에 arr[i] 값 temp에 대입한다.
            arr[j] = arr[j-1]; // arr[i-1]의 값을 arr[i]에 대입한다.
            arr[j-1] = temp; // temp의 값을 arr[i-1]에 대입한다.
        }

        return arr;
    }
    public static void main(String[] args) {
        // 5에서 출발 합니다.
        int[] arr = {8, 5, 6, 2, 4}; // arr 배열 초기화

        int i = 1; // int i = 1 에서 출발

        InsertionSort02 is = new InsertionSort02();
        int[] result = is.sort(arr, 1); // result에 sort 메서드 실행하여 return값 넣어줌

        System.out.println(Arrays.toString(result));

    }
}
