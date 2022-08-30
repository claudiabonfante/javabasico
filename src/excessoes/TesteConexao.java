package excessoes;

public class TesteConexao {
    public static void main(String[] args) {
//        Conexao con = null;
//        try{
//            con = new Conexao();
//            con.leDados();
//        }catch (IllegalStateException ex){
//            System.out.println("Erro de conexão");
//        }finally {
//            con.fecha();
//        }

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Erro de conexão");
        }
    }
}
