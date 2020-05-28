import java.util.Scanner;
class Exercicio1{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Informe o seu nome: ");
String cliente = teclado.next().toUpperCase();

System.out.println(" Informe a quantidade de diarias ");
double diaria = teclado.nextDouble();

if (diaria <= 0) {
    System.out.printf(" Opcao invalida, tente novamente !");
} else {
    if (diaria == 15){
        diaria = (80 * diaria) + (diaria * 6 );
        System.out.printf("%s, O valor da sua taxa de servicos eh 06 reais ao dia, o valor da sua conta eh: %.2f!!!", cliente, diaria);
    } else if (diaria < 15) {
        diaria = (80 * diaria) + (diaria * 8 );
        System.out.printf("%s, O valor da sua taxa de servicos eh 08 reais ao dia, o valor da sua conta eh: %.2f!!!", cliente, diaria);
    } else {
        diaria = (80 * diaria) + (diaria * 5.50 );
        System.out.printf("%s, O valor da sua taxa de servicos eh 5.50 reais ao dia, o valor da sua conta eh: %.2f!!!", cliente, diaria);
   }
}

}

}