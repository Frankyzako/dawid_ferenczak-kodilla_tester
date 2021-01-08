import java.util.Random;

public class RandomNumbers {

   public boolean numbers() {
       Random random = new Random();
       int number = random.nextInt(30);
       int sum = 0;
       for (int i = 0; i < number; i++) {
           sum = sum + i;
       }
       return sum > 5000;
   }
}
