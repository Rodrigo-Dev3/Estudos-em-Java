public class Vetores {

    private String[] elementos;

    public Vetores(int capacidadeElementos){
        this.elementos = new String[capacidadeElementos];
    }

    public void AdicionaFinalVetor(String elementoQueroAdicionar){
        for(int contaPosicao = 0; contaPosicao < elementos.length; contaPosicao++){
            //Verifico se a posição do vetor está null, ou seja, sem nenhum valor 
            if(this.elementos[contaPosicao] == null){
                //Caso esteja, posso adicionar um valor nessa posição do vetor
                this.elementos[contaPosicao] = elementoQueroAdicionar;
                //Como eu quero adicionar na primeira posição null que encontrar, utilizo o comando break para parar o código
                break;
            }
        }

    }
    
}
