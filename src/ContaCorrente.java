public class ContaCorrente extends Conta {

    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente===");
        ImprimirAtributos();
    }

    public void ImprimirAtributos() {
        System.out.printf("Agência: %d%n", super.agencia);
        System.out.printf("Número: %d%n", super.numero);
        System.out.printf("Saldo: %.2f%n", super.saldo);
    }
}