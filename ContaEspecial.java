package exercise1;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(String nomeCliente, String numeroConta, double saldo, double limite) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSacar(double valor){
        if (valor > saldo){
           this.saldo = saldo + limite;
            if (valor > this.saldo){
                System.out.println("Saque invalido!");
                saldo = valor;
            }
        }

        return  saldo -= valor;
    }

    public String toString() {
        return  "Conta Especial: " +
                super.toString();
    }



}
