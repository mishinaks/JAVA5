import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input num:");
        String numone = in.nextLine();
        System.out.println("Input num:");
        int numtwo = in.nextInt();
        Integer num = Integer.parseInt(numone);
        if (num > numtwo){
            System.out.println("Большее значение: " + num);
            double nummin = (double) numtwo;
            System.out.println("Меньшее значение: " + nummin);
        }
        else{
            System.out.println("Большее значение: " + numtwo);
            double nummin = (double) num;
            System.out.println("Меньшее значение: " + nummin);
        }
    }
}
