import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- GIAI PHUONG TRINH ---");
        System.out.println("1. Phuong trinh bac nhat 1 an (ax + b = 0)");
        System.out.println("2. He phuong trinh bac nhat 2 an");
        System.out.println("3. Phuong trinh bac hai 1 an (ax^2 + bx + c = 0)");
        System.out.print("Chon chuong trinh (1-3): ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            solveLinearEquation(scanner);
        } else if (choice == 2) {
            solveLinearSystem(scanner);
        } else if (choice == 3) {
            solveQuadraticEquation(scanner);
        } else {
            System.out.println("Lua chon khong hop le.");
        }
        
        scanner.close();
    }

    public static void solveLinearEquation(Scanner scanner) {
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            System.out.println("Phuong trinh co nghiem x = " + (-b / a));
        }
    }

    public static void solveLinearSystem(Scanner scanner) {
        System.out.println("Nhap cac he so a11, a12, b1: ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        System.out.println("Nhap cac he so a21, a22, b2: ");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            System.out.println("He co nghiem duy nhat:");
            System.out.println("x1 = " + (D1 / D));
            System.out.println("x2 = " + (D2 / D));
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He co vo so nghiem.");
            } else {
                System.out.println("He vo nghiem.");
            }
        }
    }

    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Do a = 0, giai nhu phuong trinh bac nhat:");
            if (b == 0) {
                if (c == 0) System.out.println("Vo so nghiem.");
                else System.out.println("Vo nghiem.");
            } else {
                System.out.println("x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep x = " + (-b / (2 * a)));
            } else {
                System.out.println("Phuong trinh vo nghiem thuc.");
            }
        }
    }
}