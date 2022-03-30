public interface InterfaceConta {
        void sacar (double valor);
        void depositar (double valor);
        void trasferir (double valor, Conta contadestino);
        void ImprimirExtrato();


    }
