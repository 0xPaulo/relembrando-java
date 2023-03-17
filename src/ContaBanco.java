public class ContaBanco {
    public int numConta;
    protected String tipo;
    // private String dono;
    private int saldo;
    private boolean status = false;

    public void abrirConta() {
        this.saldo = 0;
        this.status = true;
        System.out.println("estatus ligada");
        System.out.println("A conta esta aberta, saldo " + saldo);
    }

    public void fecharConta() {
        if (saldo == 0) {
            System.out.println("A conta esta fechada");
        } else
            System.out.println("Nao foi possivel fechar a conta");
    }

    public void depositar(int valor) {
        if (status == true) {
            this.saldo = valor;
            System.out.println("Valor depositado " + valor);

        } else
            System.out.println("Sua conta nao esta ativa");
    }

    public void sacar(int valor) {
        if (saldo > valor) {
            saldo = saldo - valor;
            System.out.println("Foi sacado o valor " + valor);
        }else
        System.out.println("Vc nao tem todo esse dinheiro pra sacar");

    }

    public int getSaldo() {
        return saldo;
    }

}
