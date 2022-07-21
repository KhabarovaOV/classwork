import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[2][5];

        int a = 0;
        int b = 5;
        int diff = b - a;
        Random random = new Random();
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                c = random.nextInt(diff + 1);
                c += a;
                matrix[i][j] = c;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum = sum + i;
            int sm = sum / 5;

            for (int j = 0; j < matrix[i].length; i++) {
                sum2 = sum2 + j;
                int s = sum2 / 5;


                if (sum < sum2) {
                    System.out.println("Среднее арифметическое 2 строки : " + s + " больше среднего арифметического 1 строки : " + sm);
                }
                System.out.println("Среднее арифметическое 1 строки : " + sm + " больше среднего арифметического 2 строки : " + s);

            }
        }

    }
}
