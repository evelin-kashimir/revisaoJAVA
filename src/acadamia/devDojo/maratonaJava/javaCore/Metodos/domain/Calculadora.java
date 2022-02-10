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

        public void somaArray(int []numeros){
            int soma = 0;
            for(int num: numeros){
                soma += num;
            }
            System.out.println(soma);
        }

        //Transformando a variável em array
        //varArgs devem ser o ultimo parametro, caso contrário, dá erro
        public void somaVarArgs(int...numeros){
            int soma = 0;
            for(int num: numeros){
                soma += num;
            }
            System.out.println(soma);
        }

}
