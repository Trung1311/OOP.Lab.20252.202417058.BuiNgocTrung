import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int year = -1;

        while (true) {
            System.out.print("Nhap thang : ");
            String monthInput = scanner.nextLine().trim();

            System.out.print("Nhap nam : ");
            String yearInput = scanner.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) {
                    System.out.println("Nam khong hop le. Phai la so khong am. Vui long nhap lai!\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nam khong hop le. Chi duoc nhap cac chu so. Vui long nhap lai!\n");
                continue;
            }

            month = getMonthNumber(monthInput);
            if (month == -1) {
                System.out.println("Thang khong hop le. Vui long nhap lai!\n");
                continue; 
            }

            int days = getDaysInMonth(month, year);
            System.out.println("=> So ngay cua thang " + month + " nam " + year + " la: " + days + " ngay.");
            break; 
        }
        
        scanner.close();
    }

    public static int getMonthNumber(String input) {
        input = input.toLowerCase();
        switch (input) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun.": case "jun": case "6": return 6;
            case "july": case "jul.": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sept.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1; 
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            return isLeapYear ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}