public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    // aqui, os métodos calcularSalario e toString executados são os da subclasse para add o bonus 
    @Override
    public double calcularSalario() {
        return salario + 2000.0;
    }

    @Override
    public String toString() {
        double bonus = 2000.0;
        return "Nome: " + nome +
               " | CPF: " + cpf +
               " | Salário base: R$ " + salario +
               " | Bônus: R$ " + bonus +
               " | Salário total: R$ " + calcularSalario() +
               " | Nascimento: " + dataNascimento;
    }

}
