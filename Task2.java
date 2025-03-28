import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.println("Введите число :");
        int number=scanner.nextInt();
        System.out.println("Введите процент");
        int procent=scanner.nextInt();
        System.out.printf("%d процентов от %d = %.2f", procent, number, percentage(number,procent));
    }

    private static double percentage(int number, int procentage){


        return (double)number/100*procentage;
    }
}
