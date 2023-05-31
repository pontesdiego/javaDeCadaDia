package exercise1;

public abstract class ContaBancaria {
    protected String nomeCliente;
    protected String numeroConta;
    protected double saldo;


    public ContaBancaria(String nomeCliente, String numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getMensagem() {

        String mensagem;

        if(saldo == 0){
             mensagem = "\n saldo: Impossivel realizar saque!";
        } else {
             mensagem = "\n saldo: " + saldo ;
        }

        return mensagem;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSacar(double valor){
        if (valor > saldo){
            System.out.println("Saque invalido!");
            saldo = valor;
        }
          return  saldo -= valor;
    }

    public double getDepositar(double valor){
        return this.saldo = saldo + valor;
    }



    @Override
    public String toString() {
        return  "\n Nome do Cliente: '" + nomeCliente + '\'' +
                "\n Numero da Conta: '" + numeroConta + '\'' +
                   getMensagem()  ;



    }


}
