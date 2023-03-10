package Enumeracoes;

public class Enum {

    //Enum mais complexo - com contrutor, método e mensagens
    //Declara-se o enum
    enum DiaDaSemana{
        segunda ("Bom dia! Hoje é segunda-feira"),
        terça ("Bom dia! Hoje é terça-feira"),
        quarta ("Bom dia! Hoje é quarta-feira"),
        quinta ("Bom dia! Hoje é quinta-feira"),
        sexta ("Bom dia! Hoje é sexta-feira"),
        sábado ("Bom dia! Hoje é sábado"),
        domingo ("Bom dia! Hoje é domingo");

        //Dentro das chaves do enum - declara-se uma constante para ser uma mensagem - OPCIONAL 
        private final String mensagem; 

        //Declara-se um construtor para exibir a mensagem quando o enum for chamado - OPCIONAL
        DiaDaSemana(String mensagem){
            this.mensagem = mensagem;
        }
    
        //Cria-se um método para exibir a mensagem do enum - OPCIONAL
        public void exibirMensagem() {
            System.out.println(mensagem);
        }
    }

    //Enum mais simples, apenas com a declaração de cada objeto
    enum Feriados{
        Pascoa,
        Natal, 
        Ano_Novo
    }


}
