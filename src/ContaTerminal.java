import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner teclado = new Scanner(System.in);
        Integer numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Exibir as mensagens para o nosso usuário
        System.out.println("Olá seja bem-vindo !");
        System.out.println("Digite o Seu nome: ");
        nomeCliente = teclado.nextLine();
        System.out.println("--------------------");
     
        System.out.println("Digite a sua Agência: ");
        agencia = teclado.nextLine().replaceAll("[^\\d]", "").replaceAll("...", "$0-");
    
        System.out.println("--------------------");
        System.out.println("Digite o Numero: ");
        numero = teclado.nextInt();
        System.out.println("--------------------");
        System.out.println("Digite o seu saldo: ");
        saldo = teclado.nextDouble();
        teclado.close();

        //Exibir a mensagem conta criada 
        System.out.printf("Olá ".concat(nomeCliente)+", obrigado por criar uma conta em nosso banco. Sua agência é ".concat(agencia)+", conta %d e seu saldo é %.2f",numero,saldo);
    }
}

