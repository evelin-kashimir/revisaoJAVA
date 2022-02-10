package acadamia.devDojo.maratonaJava.javaCore.Metodos.domain;

//Métodos
public class Calculadora {

    //método vazio, sem retorno
    public void soma(){
        System.out.println(10 + 10);
    }

    //Métodos com retorno
    public int somaParametro(int a, int b){
        return a + b;
    }
    public double divisao(double a, double b){
        return a / b;
    }
    public double multiplicacao(double a, double b){
        return a * b;
    }
    public int subtracao(int a, int b){
        return a - b;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }


}
