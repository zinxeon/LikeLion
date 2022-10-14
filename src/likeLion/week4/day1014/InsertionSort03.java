package likeLion.week4.day1014;

import java.util.Arrays;

public class InsertionSort03 {
    // 메서드
    public int[] sort(int[] arr) { // 배열을 구분하다 // int i 넣는이유 : 재귀(recursive) 때문
        // loop
        for(int i = 1; i < arr.length; i++) { // i는 1부터 끝까지
            for(int j = i; j > 0; j--) { // j는 i가 증가 할때 한개씩 빼며 반복
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if(arr[j] < arr[j-1]) {
                    // indext의 값을 비교 후 자리를 바꾼다.
                    // {8, 5, 6, 2, 4} -> {5, 8, 6, 2, 4}
                    int temp = arr[j]; // int타입의 temp 변수 선언과 동시에 arr[i] 값 temp에 대입한다.
                    arr[j] = arr[j-1]; // arr[i-1]의 값을 arr[i]에 대입한다.
                    arr[j-1] = temp; // temp의 값을 arr[i-1]에 대입한다.
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        // 5에서 출발 합니다.
        int[] arr = {8, 5, 6, 2, 4}; // arr 배열 초기화

        InsertionSort03 is = new InsertionSort03();
        int[] result = is.sort(arr);
        System.out.println(Arrays.toString(result));

    }
}
