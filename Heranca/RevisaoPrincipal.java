package Heranca;

public class RevisaoPrincipal {
    
    public static void main(String[] args){

        RevisaoClasse1<String> novoPersonagem = new RevisaoClasse1<>();
        RevisaoClasse2<Integer> novoPersonagemExtendido = new RevisaoClasse2<>();

        novoPersonagem.setNome("João");
        novoPersonagem.setEstado("Dormindo");

        novoPersonagem.status();

        novoPersonagemExtendido.setNome("Pedro");
        novoPersonagemExtendido.setEstado("Acordado");
        novoPersonagemExtendido.setVida(100);
        
        novoPersonagemExtendido.statusCompleto();
        

    }
}
