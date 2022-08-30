package orientacaoobjetosjavabanco;

public class Designer extends Funcionario {
public double getBonificacao(){
    System.out.println("Chamando o get bonificacao do designer");
    return super.getBonificacao() + 200;
}
}
