import javax.swing.JOptionPane;

class exercicio2{

public static void main(String args[]){

int aulaSemanais = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de horas semanais trabalhadas: "));
double valorAula = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de cada aula: "));

double salarioBase = (aulaSemanais * valorAula * 4.25);
double horaAtividade = (salarioBase *  0.05);
double dsr = ((salarioBase + horaAtividade) / 6);
double salarioMensal = (salarioBase + horaAtividade + dsr);

System.out.printf("\nSalario Base: %.2f", salarioBase);
System.out.printf("\nHora Atividade: %.2f", horaAtividade);
System.out.printf("\nDSR: %.2f", dsr);
System.out.printf("\nSalario Mensal: %.2f", salarioMensal);

}

}