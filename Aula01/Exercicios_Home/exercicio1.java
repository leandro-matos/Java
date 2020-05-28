import javax.swing.JOptionPane;

class exercicio1{

public static void main(String args[]){

float baseRetangulo = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do retangulo"));
float baseAltura = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do retangulo"));
double raioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio de uma circunferencia"));

float retangulo = baseRetangulo * baseAltura;
double circulo = (raioCirculo * raioCirculo) * 3.14;
System.out.printf("\nA area do retangulo eh: %.2f", retangulo);
System.out.printf("\nA area da circunferencia eh: %.2f", circulo);
}

}