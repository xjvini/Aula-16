// a superclasse com os atributos básicos (nome, cpf, nascimento e salário)
// o modificador protected permite que as classes Gerente e Atendente acessessem esses atributos
// o método CalcularSalario retorna o salário base, que será usado para add o bonus comissão


public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String dataNascimento;

    public Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // método será sobrescrito pelas subclasses para add o bonus e a comissão
    public double calcularSalario() {
        return salario;
    }

    // o método toString apresenta tudo em uma linha e é sobrescrito na classe Atendente, para retornar também a comissão
    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Salário base: R$ " + salario + " | Salário total: R$ " + calcularSalario() + 
               " | Nascimento: " + dataNascimento;
    }
}
