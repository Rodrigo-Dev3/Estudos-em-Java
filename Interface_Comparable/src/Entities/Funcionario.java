package Entities;

//Para poder comparar um objeto com outro, é preciso implementar a Interface genérica Comparable<T>
public class Funcionario implements Comparable<Funcionario>{

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //Método que serve para comparar um objeto com outro da mesma classe
    //Retorna um número inteiro para expor se o valor é maior, menor ou igual
    @Override
    public int compareTo(Funcionario outroFuncionario) {
        return nome.compareTo(outroFuncionario.getNome()); //Compara o valor do objeto com o valor do outro objeto
    }
}
