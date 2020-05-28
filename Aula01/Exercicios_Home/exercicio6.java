import javax.swing.JOptionPane;

class exercicio6{

public static void main(String[] args) {

float precoAut = Float.parseFloat(JOptionPane.showInputDialog(" Digite o preco de Fabrica do seu automovel: "));
float percLuc = Float.parseFloat(JOptionPane.showInputDialog(" Digite o percentual de lucro: "));
float percImp = Float.parseFloat(JOptionPane.showInputDialog(" Digite o percentual de imposto: "));

float valor_lucro = precoAut * (percLuc/100);
float valor_impostos = precoAut * (percImp/100);
float preco_final = precoAut + valor_impostos + valor_lucro;

    //Respostas
System.out.printf("\nLucro do Distribuidor : %.2f", valor_lucro);
System.out.printf("\nImpostos : %.2f", valor_impostos);
System.out.printf("\nPreco Final : %.2f", preco_final);

}

}