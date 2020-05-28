import javax.swing.JOptionPane;

class exercicio4{

public static void main(String[] args) {

    //Entrada de dados
int nasc_ano = Integer.parseInt(JOptionPane.showInputDialog(" Qual o seu ano de nascimento ?: "));
int atual_ano = Integer.parseInt(JOptionPane.showInputDialog(" Qual o ano atual ?: "));
    //Processamento
int ida_ano=(atual_ano-nasc_ano);
int ida_mes=(ida_ano*12);
int ida_dia=(ida_ano*365);
int ida_semana=(ida_mes*4);
    //Respostas
System.out.println("A idade da pessoa em anos eh:" + ida_ano);
System.out.println("A idade da pessoa em meses eh: " + ida_mes);
System.out.println("A idade de pessoa em dias eh: " + ida_dia);
System.out.println("A idade da pessoa em semanas eh " + ida_semana);  

}

}