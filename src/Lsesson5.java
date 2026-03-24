import java.util.Scanner;

public class Lsesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        a = scannerUpper(a);
        String b= scanner.nextLine();
        b = scannerLower(b);
        print(a,b);
    }
    public static String scannerUpper(String b  ){
       b = b.toUpperCase();
       return b;
    }
    public static String scannerLower(String a ){
        a =a.toLowerCase();
        return a;
    }
    public static void print(String a, String b){
        System.out.println(a + " " +b);
    }
}
