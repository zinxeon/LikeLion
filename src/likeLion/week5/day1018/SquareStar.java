package likeLion.week5.day1018;

public class SquareStar {
    public void printSquare(int n) {
        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        squareStar.printSquare(5);

    }
}
