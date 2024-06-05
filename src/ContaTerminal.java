import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){

        System.out.println("Número da conta: ");
        int numero = new Scanner(System.in).nextInt();

        System.out.println("Agência: ");
        String agencia = new Scanner(System.in).nextLine();

        System.out.println("Nome do Cliente: ");
        String nome = new Scanner(System.in).nextLine();

        System.out.println("Saldo: ");
        double saldo = new Scanner(System.in).nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo " + saldo + " já está disponivel para saque.");

    }
}
