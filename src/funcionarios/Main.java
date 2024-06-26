package funcionarios;

public class Main {
    public static void main(String[] args) {
        Administrativo administrativo = new Administrativo("Anny Araujo", 30, 2000.0, "junior", 1200.0, 2000.0,
                2000.0);
        Gerente gerente = new Gerente("Maria Luiza", 35, 4500.0, 2, 4000.0, 4500.0);
        Diretor diretor = new Diretor("Estela Silva", 45, 8000.0, 5000.0, 16000.0);
        double promocaoAdm = administrativo.promover();
        double promocaoGerente = gerente.promover();
        double prmocaoDiretor = diretor.promover();
        double totalAdm = administrativo.calcularSalario();
        double totalGerente = gerente.calcularSalario();
        double totalDiretor = diretor.calcularSalario();

        FuncionarioGeral[] funcionarioGerais = { administrativo, gerente, diretor };

        System.out.println("Lista de funcionários da empresa: ");

        for (FuncionarioGeral funcionario : funcionarioGerais) {
            System.out.println("Nome: " + funcionario.getNome() + " Idade: " + funcionario.getIdade() + " Salario: "
                    + funcionario.getSalario());
        }
        System.out.println("Maiores detalhes:");

        System.out.println(administrativo.getNome() + " exerce o cargo administrativo e recebe remuneração mensal "
                + totalAdm + " e seu nivel atual de senioridade é "
                + administrativo.getSenioridade()
                + ". Além disso, foi promovida para Pleno e sua nova remuneração sera de: "
                + promocaoAdm + "!");

        System.out.println(gerente.getNome() + " exerce o cargo de gerente e comanda um total de "
                + gerente.getQntEquipes() + " equipes"
                + " , sua remuneração mensal é de " + totalGerente
                + ". Foi promovida e sua nova remuneração sera de: "
                + promocaoGerente + "!");

        System.out.println(
                diretor.getNome() + " exerce o cargo de diretor(a) da companhia, e sua remuneração mensal é de "
                        + totalDiretor
                        + ". Assume o cargo de presidente e sua nova remuneração sera de: " + prmocaoDiretor + "!");
    }
}
