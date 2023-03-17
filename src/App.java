public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco conta1 = new ContaBanco();
        conta1.abrirConta();
        conta1.depositar(10);
        System.out.println("saldo "+ conta1.getSaldo());
        conta1.sacar(11);
        System.out.println("saldo "+ conta1.getSaldo());
        conta1.fecharConta();


    }
}
