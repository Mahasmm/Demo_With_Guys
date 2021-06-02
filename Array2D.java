public class Array2D {

    public static void main(String[] args) {
        int[][] Poly = { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 2, 3, 4, 5 } };
        // 1*X^3+2*X^4+...

        for (int i = 0; i < Poly.length; i++) {
            for (int j = 0; j < Poly[i].length; j++) {
                System.out.print(Poly[i][j]);
            }
            System.out.println("");
        }
    }
}
//edit