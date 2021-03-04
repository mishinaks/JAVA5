import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            myArray[i] = random.nextInt(41) - 20;
        }
        int min = 20;
        for (int i = 0; i < 15; i++) {
            min = Math.min(myArray[i], min);
        }
        int max = -20;
        for (int i = 0; i < 15; i++) {
            max = Math.max(myArray[i], max);
        }
        if (Math.abs(min) == Math.abs(max)){
            System.out.printf("Значения равны по модулю: мин = %d  макс = %d", min, max );
            return;
        }
        int answer = (Math.abs(min) < Math.abs(max)) ? max :  min;
        System.out.println("Наибольшее значение по модулю " + answer);
    }
}
