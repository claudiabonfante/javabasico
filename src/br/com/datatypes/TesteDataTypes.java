package br.com.datatypes;

import java.util.ArrayList;
import java.util.List;

public class TesteDataTypes {
    public static void main(String[] args) {
        int idade = 20;

//        unboxing e autounboxing
        Integer idade2 = Integer.valueOf(idade);

//        casting
        int valorInt = 1000;
        long valorLong = valorInt;
        float valorFloat = valorLong;
        double valorDouble = valorFloat;

        System.out.println(valorInt);
        System.out.println(valorLong);
        System.out.println(valorFloat);
        System.out.println(valorDouble);

//        IF encadeado
        if(valorInt > 1000){

        } else if (valorInt > 500) {

        }

        List lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

//        For
        for (int i = 0; i<= lista.size(); i++){
            System.out.println("**** Tabuada do: " + i);
            for (int j = 0; j <= 10; j++){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
}
