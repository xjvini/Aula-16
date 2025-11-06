// Essa é a classe principal. O ArrayList guarda a informação de gerentes e atendentes 

// O menu possui o do.. while para garantir a repetição dele até que o usuário deseje sair

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao = 0;

        do {
            System.out.println("\n= = = MENU FUNCIONÁRIOS = = =");
            System.out.println("1. Adicionar gerente");
            System.out.println("2. Adicionar atendente");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Mostrar salário de um funcionário (por CPF)");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nNome: ");
                    String nomeG = entrada.nextLine();
                    System.out.print("\nCPF: ");
                    String cpfG = entrada.nextLine();
                    System.out.print("\nSalário base: ");
                    double salarioG = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("\nData de nascimento (dd/mm/yy): ");
                    String dataG = entrada.nextLine();

                    funcionarios.add(new Gerente(nomeG, cpfG, salarioG, dataG));
                    System.out.println("\nGerente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("\nNome: ");
                    String nomeA = entrada.nextLine();
                    System.out.print("\nCPF: ");
                    String cpfA = entrada.nextLine();
                    System.out.print("\nSalário base: ");
                    double salarioA = entrada.nextDouble();
                    System.out.print("\nComissão: ");
                    double comissaoA = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("\nData de nascimento: ");
                    String dataA = entrada.nextLine();

                    funcionarios.add(new Atendente(nomeA, cpfA, salarioA, dataA, comissaoA));
                    System.out.println("\nAtendente adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\nLISTA DE FUNCIONÁRIOS:");
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : funcionarios) {
                            System.out.println(f.toString());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite o CPF do funcionário: ");
                    String cpfBusca = entrada.nextLine();
                    boolean encontrado = false;

                    for (Funcionario f : funcionarios) {
                        if (f.getCpf().equals(cpfBusca)) {
                            System.out.printf("Funcionário: %s | Salário total: R$ %.2f%n",
                                    f.getNome(), f.calcularSalario());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Erro! Funcionário não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        entrada.close();
    }
}
