package GetESet;

public class GetSet {
    
    public static void main(String[] args){

        int setNumero;
        GetSetClasse testGetESet = new GetSetClasse("Rodrigo");

        
        System.out.println(testGetESet.GetNome());
        System.out.println(testGetESet.GetNumero());

        testGetESet.SetNome(2);
        System.out.print(testGetESet.GetNumero());

    }
}
