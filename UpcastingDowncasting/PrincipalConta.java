package UpcastingDowncasting;

public class PrincipalConta {
    public static void main(String[] args) {
        
        Conta novaConta = new Conta(555, "Frederico", 0.0);
        ContaNegocios novaContaNegocios = new ContaNegocios(5556, "Maria", 0.0, 500.0);

        //UPCASTING
        //Um objeto da subclasse é atribuido por um objeto da superclasse - sem erros
        Conta contaUpcasting = novaContaNegocios; 
        Conta contaUpcasting2 = new ContaNegocios(1003, "Bob", 0.0, 500.0);
        Conta contaUpcasting3 = new ContaPoupanca(1004, "Joana", 100.0, 10.0);

        //DOWNCASTING

        //ContaNegocios contaDowncasting = contaUpcasting2; //Apresenta erro pois não é possível realizar casting de uma superclasse para uma subclasse diretamente
        ContaNegocios contaDowncasting2 = (ContaNegocios) contaUpcasting2; // Para solucionar o erro é preciso realizar o casting manualmente
        
        //Aqui está sendo tentado fazer casting de um objeto do tipo ContaPoupança em um objeto do tipo ContaNegócios
        //Ela só apresentará erro no momento de execução do código
        //Nesse caso é preciso saber / testar se o objeto que deseja-se fazer o downcasting é do mesmo tipo do objeto original
        ContaNegocios contaDowncasting3 = (ContaNegocios) contaUpcasting3;

        //Para testar é utilizado o INSTANCEOF() - para saber qual é a instancia do objeto 
        if(contaUpcasting3 instanceof ContaNegocios){
            ContaNegocios contaDowncasting4 = (ContaNegocios) contaUpcasting3; //Faz o Downcasting
            contaDowncasting4.Emprestimo(100); //utiliza um método apenas da classe ContaNegocio
            System.out.print("Empréstimo!"); 
        }

        // if(contaUpcasting3 instanceof ContaPoupanca){
        //     ContaPoupanca contaDownCasting5 = (ContaPoupanca) contaUpcasting3; //faz o Downcasting
        //     contaDownCasting5.AtualizarSaldo(); //utiliza um método apenas da classe ContaPoupança
        //     System.out.println("Saldo atualizado: ");
        //     System.out.print(contaDownCasting5.saldoConta);
        // }


    }
}
