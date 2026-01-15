/**
 * الملف: VariableBasics.java
 * الغرض: شرح مفهوم المتغيرات كصناديق رقمية
 * المهندسة: هنادي
 */

public class VariableBasics {
    public static void main(String[] args) {
        
        // 1. النوع النصي (String): صندوق للكلمات والجمل
        // نضع النص دائماً بين علامتي تنصيص " "
        String myRole = "مهندسة برمجيات طموحة"; 
        
        // 2. النوع الرقمي (int): صندوق للأرقام الصحيحة فقط
        int hoursofCoding = 2; // تخيليه كصندوق يحمل الرقم 2
        
        // 3. النوع المنطقي (boolean): صندوق لا يحمل إلا (صح أو خطأ)
        // يستخدم كثيراً في اتخاذ القرارات لاحقاً
        boolean isLearningFinished = false; 

        // 4. النوع العشري (double): للأرقام التي تحتاج دقة وفواصل
        double javaVersion = 17.0;
        
        // جملة بسيطة تربط المتغير بالواقع
        if (!isLearningFinished) {
            System.out.println("الرحلة مستمرة، والشغف يزداد!");
        }
    }
}
