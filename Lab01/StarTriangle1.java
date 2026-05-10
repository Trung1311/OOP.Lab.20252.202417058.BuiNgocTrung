import java.util.Scanner;

public class StarTriangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chieu cao (n): ");
        int n = scanner.nextInt();
        
        // Vòng lặp chạy qua từng hàng từ 1 đến n
        for (int i = 1; i <= n; i++) {
            
            // 1. Vòng lặp in khoảng trắng (n - i khoảng trắng)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); 
                // Lưu ý dùng print(), không dùng println() để in trên cùng 1 dòng
            }
            
            // 2. Vòng lặp in dấu sao (2*i - 1 dấu sao)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // 3. In ký tự xuống dòng sau khi đã hoàn thành một hàng
            System.out.println();
        }
        
        scanner.close();
    }
}