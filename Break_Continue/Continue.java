package Break_Continue;

public class Continue {
    
    public static void main(String[] args){

        int contador = 20;

        for(int i = 0; i < contador; i++){
            if(i >= 5 && i <= 10){
                continue;
            }

            System.out.printf("%d - ", i);
        }
    }
}
