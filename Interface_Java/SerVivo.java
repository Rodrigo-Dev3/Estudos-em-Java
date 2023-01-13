package Interface_Java;

public interface SerVivo {
    //Em vez de 'public class SerVivo' é 'public interface SerVivo' pois se trata de uma interface e não de uma classe padrão

    
    //Tbm é possível definir atributos, por mais que sejam menos comuns de serem utilizados em uma interface
    //Os modificadores de acesso utilizados em uma interface somente são o 'public', 'final' e 'static' - private e protected não podem ser utilizados
    //Como eu inseri um atributo publico e o iniciei na interface, esse atributo não precisará ser definido novamente na classe 
    //Quando inserir um atributo, é orbigatório inicializá-lo dentro da interface
    public Boolean vivo = true;



    //Não define os métodos em si, apenas quais método a outra classe deverá ter
    public void mover(); 
    
    public void comer(int massa);

    public void informacoes();
}
