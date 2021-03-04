import java.util.Scanner;
public class Spacing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String numone = in.nextLine();
        String[] result = numone.split(" ");
        int length = result.length;
        int counterone = 0;
        for (int i = 0; i < length; i++) {
            int sizest = result[i].length();
            int countertwo = 0;
            for (int a = 0; a < sizest; a++) {
                char sim;
                sim = result[i].charAt(a);
                if  (sim >= '\u0041' && sim <= '\u005A' ||  sim >= '\u0061' &&  sim <= '\u007A'){
                    countertwo ++;
                }
            }
            if (countertwo == sizest){
                System.out.println(result[i]);
                counterone ++;
            }
        }
        System.out.println("Колличество слов: " + counterone);
    }
}
