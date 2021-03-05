import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input num:");
        String numone = in.nextLine();
        System.out.println("Input num:");
        int numtwo = in.nextInt();
        double dbnumone = Double.parseDouble(numone);
        double dbnumtwo = numtwo;
        if (dbnumone > dbnumtwo){
            System.out.println("Большее значение: " + dbnumone);
            System.out.println("Меньшее значение: " + dbnumtwo);
        }
        else{
            System.out.printf("Большее значение: %.0f %n", dbnumtwo);
            System.out.println("Меньшее значение: " + dbnumone);
        }
    }
}
