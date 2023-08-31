import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== bem vindo ao sistema de cadastro de cachorro");

        var scanner = new Scanner(System.in);
        CadastrarCachorro(scanner);
    }

    public static void CadastrarCachorro(Scanner scanner)
    {
        System.out.println("primeiro digite o nome do cachorro");
        String nome = scanner.nextLine();

        System.out.println("agora digite a raça do cachorro");
        String raca = scanner.nextLine();

        System.out.println("cadastro realizado: Nome: "+ nome+ ", raça " + raca);

    }
}