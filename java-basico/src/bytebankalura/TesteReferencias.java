package bytebankalura;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraconta = new Conta();
        primeiraconta.saldo = 300;

        System.out.println(primeiraconta.saldo);

        Conta segundaConta = primeiraconta;
        System.out.println(segundaConta.saldo);
    }
}
