package exercise1;

public class ContaPoupanca extends ContaBancaria{
    private String diaRendimento;

    public ContaPoupanca(String nomeCliente, String numeroConta, double saldo, String diaRendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public String getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return  "\n Conta Poupanca: " +
                super.toString() +
                "\n Dia de Rendimento: '" + diaRendimento + '\'' ;
    }
}
