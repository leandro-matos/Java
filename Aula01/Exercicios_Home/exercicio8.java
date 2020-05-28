import javax.swing.JOptionPane;

class exercicio8{

public static void main(String[] args) {

int saque = Integer.parseInt(JOptionPane.showInputDialog(" Entre com o valor do saque "));

int saque100 = saque / 100;
saque = saque % 100;
System.out.printf("\nCedulas de 100: " + saque100);

int saque50= saque / 50;
saque = saque % 50;
System.out.printf("\nCedulas de 50: " + saque50);

int saque20= saque / 20;
saque = saque % 20;
System.out.printf("\nCedulas de 20: " + saque20);

int saque10= saque / 10;
saque = saque % 10;
System.out.printf("\nCedulas de 10: " + saque10);

int saque5= saque / 5;
saque = saque % 5;
System.out.printf("\nCedulas de 5: " + saque5);

int saque2= saque / 2;
saque = saque % 2;
System.out.printf("\nCedulas de 2: " + saque2);

int saque1= saque / 1;
saque = saque % 1;
System.out.printf("\nCedulas de 1: " + saque1);

}

}