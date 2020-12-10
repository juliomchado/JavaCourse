import java.util.Locale;

public class Main {
    public static void main(String[] args){

        String printSemln = "Teste de não pular linha";
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        
        int y = 32;
        double x = 10.35784;
        
        System.out.println(y);
        System.out.print(printSemln);
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.println("Bom dia!");
        System.out.printf("RESULTADO = " + x + " METROS%n");
        System.out.printf("RESULTADO = %.2f METROS%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


    }
}
