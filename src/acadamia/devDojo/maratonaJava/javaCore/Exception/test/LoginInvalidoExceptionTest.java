package acadamia.devDojo.maratonaJava.javaCore.Exception.test;

import acadamia.devDojo.maratonaJava.javaCore.Exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {

    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException{
        Scanner sc = new Scanner(System.in);
        String usenameDB = "naruto";
        String senhaDB = "12345";

        System.out.println("Usuário:");
        String usernameDigitado = sc.nextLine();

        System.out.println("Senha:");
        String senhaDigitada = sc.nextLine();

        if (!senhaDB.equals(senhaDigitada) || !usenameDB.equals(usernameDigitado)){
          throw new LoginInvalidoException("Usuario ou senha Incorretos");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}

