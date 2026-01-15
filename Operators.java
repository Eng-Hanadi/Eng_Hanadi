: إذا كانت المتغيرات هي الصناديق، فالعمليات هي "ماذا نفعل بهذه 
الصناديق؟". هل نجمعها؟ هل نطرحها؟ هل نقارن بينها؟

/**
 * الدرس الثاني: العمليات البرمجية (Operators)
 * المهندسة: هنادي
 * الوصف: هذا الكود يطبق العمليات الحسابية والمنطقية على المتغيرات
 */

public class OperationsLab {
    public static void main(String[] args) {
        
        // 1. تعريف المتغيرات (الصناديق)
        int score1 = 85;
        int score2 = 90;
        int bonus = 5;

        // 2. العمليات الحسابية (Arithmetic Operators)
        // نجمع الدرجات مع الإضافات
        int finalScore = (score1 + score2) / 2 + bonus;

        // 3. عمليات المقارنة (Comparison Operators)
        // هل النتيجة النهائية أكبر من أو تساوي 90؟
        boolean isExcellent = finalScore >= 90;

        // 4. عرض النتائج (Output)
        System.out.println("---- نتائج المعالجة ----");
        System.out.println("الدرجة النهائية المحسوبة: " + finalScore);
        System.out.println("هل التقدير ممتاز؟ " + isExcellent);

        
  
        
    }
}
