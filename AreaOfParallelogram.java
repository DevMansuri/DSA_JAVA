import java.util.Scanner;
/*
Author : DevMansuri.
Purpose : To Calculate Area of Parallelogram.
 */
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of Triangle :");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of Triangle :");
        double height = scanner.nextDouble();

        double area = base * height;
        System.out.println("Area of Parallelogram is : " + area);
        scanner.close();
    }
}
