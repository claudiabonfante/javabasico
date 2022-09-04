package br.com.operadores;

public class TiposPrimitivos {
    public static void main(String[] args) {
//        Nº inteiros: byte, short, int, long, char-ascii
//        Ponto flutuante: float, double;
//        \n pula linha
//        \r o cursor retorna para o inicio da linha

        byte idade1 = 20;
        short idade2 = 21;
        int idade3 = 22;
        long idade4 = 23;

        System.out.println("Idade: " + idade1);
        System.out.println("Idade: " + idade2);
        System.out.println("Idade: " + idade3);
        System.out.println("Idade: " + idade4);

        double valorPassagem = 2.90;
        float valorTomate = 3.95f;

        System.out.println("Valor da passagem: " +valorPassagem);
        System.out.println("Valor do tomate: " +valorTomate);

//        char o = 'o';
//        char i = 'i';
//        System.out.println(o+i);

        char o = 'o';
        char i = 'i';
        char interrogacao = 0x00E1;
        System.out.println(o+i+interrogacao);



    }
}
