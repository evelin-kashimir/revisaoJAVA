package acadamia.devDojo.maratonaJava.javaCore.Enume.domain;

//Enum - É um tiipo especial de classe onde todos os atributos criados são constantes;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }
}
