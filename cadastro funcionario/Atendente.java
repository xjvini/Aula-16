public class Atendente extends Funcionario {
    private double comissao;

    public Atendente(String nome, String cpf, double salario, String dataNascimento, double comissao) {
        super(nome, cpf, salario, dataNascimento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
    
    // aqui, os métodos calcularSalario e toString executados são os da subclasse para add a comissão
    @Override
    public double calcularSalario() {
        return salario + comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Salário base: R$ " + salario + 
               " | Comissão: R$ " + comissao + " | Salário total: R$ " + calcularSalario() + " | Nascimento: " + dataNascimento;
    }
}
