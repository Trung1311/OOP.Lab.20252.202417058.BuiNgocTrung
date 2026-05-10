import java.util.Arrays;

public class ArraySortingAndCalculation {
    public static void main(String[] args) {
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
        System.out.println("Mang ban dau: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(my_array1));
        int sum = 0;
        for (int i = 0; i < my_array1.length; i++) {
            sum += my_array1[i];
        }
        double average = (double) sum / my_array1.length;

        System.out.println("Tong cac phan tu (Sum): " + sum);
        System.out.println("Gia tri trung binh (Average): " + average);
    }
}