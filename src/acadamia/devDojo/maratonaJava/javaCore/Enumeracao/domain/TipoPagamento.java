package acadamia.devDojo.maratonaJava.javaCore.Enumeracao.domain;

public enum TipoPagamento {
       //implementando o método para a enumeracao debito evitando o uso de if nos metodos
        DEBITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return  valor * 0.05;
        }
    };
        //MÉTODOS ABSTRADOS DEVEM SER SOBRESCRITOS
        public abstract double calcularDesconto(double valor);
    }