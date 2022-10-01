import java.util.Scanner;


public class TriangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника: ");
        int a = sc.nextInt();
        System.out.println("Введите вторую сторону треугольника: ");
        int b = sc.nextInt();
        System.out.println("Введите третью сторону треугольника: ");
        int c = sc.nextInt();
        String st = new Triangle(a, b, c).triangleType();
        System.out.println(st);


    }
}
