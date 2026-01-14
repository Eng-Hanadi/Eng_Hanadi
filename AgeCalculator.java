import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // إنشاء كائن لاستقبال المدخلات
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age in years: ");
        int ageInYears = input.nextInt();
        
        // حساب العمر بالشهور
        int ageInMonths = ageInYears * 12;
        
        // طباعة النتيجة
        System.out.println("Your age in months is: " + ageInMonths + " months.");
    }
}
