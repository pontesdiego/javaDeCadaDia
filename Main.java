package exercise1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria diego = new ContaEspecial("Diego", "7689", 100, 50);

        diego.getSacar(120);

        System.out.println(diego);




    }
}
