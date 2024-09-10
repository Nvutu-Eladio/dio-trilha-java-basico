import java.util.List;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Âgencia: ");
        String agencia = sc.nextLine();


        System.out.println("Por favor, digite o número da Conta: ");
        String numero = sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();


        System.out.println("Valor do saldo: ");
        int saldo = sc.nextInt();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + " ,conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";

        System.out.println(mensagem);

        sc.close();



        //TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

    }
}
