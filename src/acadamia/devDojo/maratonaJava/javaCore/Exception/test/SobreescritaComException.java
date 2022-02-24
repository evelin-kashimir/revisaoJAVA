package acadamia.devDojo.maratonaJava.javaCore.Exception.test;

import acadamia.devDojo.maratonaJava.javaCore.Exception.domain.Funcionario;
import acadamia.devDojo.maratonaJava.javaCore.Exception.domain.LoginInvalidoException;
import acadamia.devDojo.maratonaJava.javaCore.Exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaComException {
    public static void main(String[] args) throws FileNotFoundException, LoginInvalidoException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        //sobrecarga de try
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
