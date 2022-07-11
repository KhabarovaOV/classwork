import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a");
        int a = sc.nextInt();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение b");
        int b = sc.nextInt();
        Scanner scnm = new Scanner(System.in);
        System.out.println("Введите значение c");
        int c = sc.nextInt();
        Scanner scnmm = new Scanner(System.in);
        int y = b * b - 4 * a * c = 0;
        if (y!=0){
        System.out.println("Корни квадратного уравнения: " + y);}
        else {
            System.out.println("Корни квадратного уравнения не найдены");
        }

    }
}
