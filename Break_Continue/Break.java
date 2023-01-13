package Break_Continue;

public class Break {
    public static void main(String[] args){
        
        int contador = 10;

        switch(contador){
            case 10: case 40:
                System.out.println("O valor do ataque é igual a 10 ou 40");
                break;

            default:
                System.out.println("O código não pode ser executado");
        }
    }
}
