import java.util.Scanner;
public class ILikeJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        boolean podstr = str.contains("Java");
        boolean startstr = str.startsWith("I like");
        boolean endsstr = str.endsWith("!!!");
        if ( podstr && startstr && endsstr ){
            String resultupp = str.toUpperCase();
            System.out.println(resultupp);
        }
        String resultao = str.replace('a',  'o');
        System.out.println(resultao.substring(7, 11));
    }
}
