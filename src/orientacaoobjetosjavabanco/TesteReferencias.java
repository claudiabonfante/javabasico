package orientacaoobjetosjavabanco;

public class TesteReferencias {
    public static void main(String[] args) {
//        Conta primeiraconta = new Conta();
//        primeiraconta.saldo = 300;
//
//        System.out.println(primeiraconta.saldo);
//
//        Conta segundaConta = primeiraconta;
//        System.out.println(segundaConta.saldo);

        Funcionario g1 = new Gerente();
        g1.setNome("Novo Teste");
        String nome = g1.getNome();

        System.out.println(nome);
    }
}
