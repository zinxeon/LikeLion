package study.day1007;

public class Test4 {
    public static void main(String[] args) {

        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;

        /*
        (1) . 알맞은 코드를 넣어 완성하시오

        답:
        int avgCount = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <arr[i].length; j++) {
                total += arr[i][j];
                avgCount += 1;
            }
            average = total/avgCount;
        }

        정답:
        for(int i=0; i < arr.length;i++) {
            for(int j=0; j < arr[i].length;j++) {
                total += arr[i][j];
            }
        }
        average = total /(float)(arr.length * arr[0].length);
        */

        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
