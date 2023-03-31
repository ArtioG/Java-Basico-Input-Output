import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Cliente: ");
        String cliente = sc.nextLine();
        System.out.println("Digite o nome da raca do animal: ");
        String raca = sc.nextLine();
        System.out.println("Digite o numero do Cliente: ");
        String numero = sc.nextLine();
        System.out.println("Digite o CPF do Cliente: ");
        String CPF = sc.nextLine();
        System.out.println("Digite o endereco do Cliente: ");
        String endereco = sc.nextLine();

        System.out.println("Nome: " + cliente
                + "\nRaca: " + raca
                + "\nnumero: " + numero
                + "\nCPF: " + CPF
                + "\nendereco: " + endereco);
    }
}
