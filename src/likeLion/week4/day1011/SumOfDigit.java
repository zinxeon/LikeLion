package likeLion.week4.day1011;

public class SumOfDigit {
    // 알고리즘
    // 방법1
    public int solution1(int n) {
        // n 을 String으로 변경
        String str = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        // String을 loop 돌면서 parseInt후 더한다.

        return result;
    }

    // 방법2
    public int solution(int n) {
        // %연산 이용 몫,나머지
        int result = 0;
//        int origin = n; // 공간복잡도를 줄이기 위해 origin대신 n 사용

        /*// i = 0
        System.out.println(n / 10); // n/10 몫
        System.out.println(n % 10); // n/10 나머지
        // i = 1
        System.out.println(n / 10); // n/10 몫
        System.out.println(n % 10); // n/10 나머지
        while (origin > 0) {
            result += origin % 10;
            origin = origin / 10;
            System.out.printf("origin:%d result:%d", origin, result);
        }*/

//        return 0;

        // while문 사용
        while (n > 0) {
            result += n % 10;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        // 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        // N = 123이면 1 + 2 + 3 = 6을 return
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if(result1 == 10) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패 result: %d \n", result1);
        }
    }
}
