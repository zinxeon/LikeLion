package study.day1012;

public class Ch6_6 {
    // (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
    static double getDistance(int x, int y, int x1, int y1) {
        // 답
        int width = x1 - x;
        int height = y1 - y;
        double answer = Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
        return answer;
    }
    public static void main(String args[]) {
        System.out.println(getDistance(1,1,2,2));
    }
}
