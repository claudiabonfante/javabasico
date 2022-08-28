package bytebankalura;

public class EditorVideo extends Funcionario {
    public double getBonificacao(){
        System.out.println("Chamando o get bonificacao do editor video");
        return super.getBonificacao() + 100;
    }
}
