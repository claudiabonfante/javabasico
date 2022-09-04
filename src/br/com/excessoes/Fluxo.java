package br.com.excessoes;

public class Fluxo {
    public static void main(String[] args) throws MinhaOutraExcecao {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException ex){
                String msg = ex.getMessage();
                System.out.println("Exception" + msg);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaOutraExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaOutraExcecao{
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);

            Conta c = null;
            c.deposita();
//            try{
//                int a = i / 0;
//            }catch (ArithmeticException ex){
//                String msg = ex.getMessage();
//                System.out.println("Arithmetic Exception" + msg);
//            }
        }
        System.out.println("Fim do metodo2");
    }
}
