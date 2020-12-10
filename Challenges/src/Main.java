import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("1. Você digitou: " + x);
        
        
        int y;
        y = sc.nextInt();
        System.out.println("2. Você digitou: " + y);


        double l;
        l = sc.nextDouble();
        System.out.printf("3. Você digitou: %.2f%n", l);

        char z;
        z = sc.next().charAt(0);
        System.out.println("4. Você digitou: " + z);

        sc.close();
    }
}
