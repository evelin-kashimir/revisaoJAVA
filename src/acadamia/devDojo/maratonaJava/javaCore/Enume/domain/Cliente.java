package acadamia.devDojo.maratonaJava.javaCore.Enume.domain;

public class Cliente {
    public enum TipoPagamento {
        DEBITO, CREDITO
    }
    private String nome;
    private TipoCliente tipoCliente; //relacionando a enumeraçao
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
