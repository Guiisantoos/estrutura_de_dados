public class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;
    private String numeroConta;

    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido: valor insuficiente ou menor que zero.");
        }
    }

    // Método para consultar o saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para exibir os dados da conta
    public String exibirDadosConta() {
        return "Titular: " + titular + "\nNúmero da Conta: " + numeroConta + "\nSaldo: R$" + saldo;
    }




    // Método principal para chamar a classe
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", "12345-6");

        // Testando depósitos e saques
        conta.depositar(1000);
        conta.sacar(200);
        conta.sacar(900); // Teste de saldo insuficiente

        // Exibindo dados da conta
        System.out.println(conta.exibirDadosConta());
    }
}
