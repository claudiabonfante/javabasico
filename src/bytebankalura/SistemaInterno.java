package bytebankalura;

public class SistemaInterno {
    private int senha = 1234;

    public void autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println("Autenticou");
        }   System.out.println("Não autenticou");

    }
}
