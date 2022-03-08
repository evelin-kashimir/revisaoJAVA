package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.Date.test;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {

        //Classe para trablhar com datas, porém desatualizada
        Date data = new Date(1646766468342L); //long que representa os milissegundos
        data.getTime(); //pega o dia de hoje em long
        System.out.println(data);

    }
}
