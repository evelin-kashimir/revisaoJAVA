package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.Dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {

        //Classe calendar nao pode ser instanciada
        Calendar c = Calendar.getInstance(); //somente desta forma
        Date date = c.getTime();  //pegando o tempo da classe instanciada acima
        System.out.println(date); //imprimindo data formatada de um jeito gambiarra

        //trazendo o primeiro dia da semana,  //Constante Monday retorna um inteiro representando o dia
        if(c.getFirstDayOfWeek() == Calendar.MONDAY){
            System.out.println("Hoje é domingo");
        } else{
            System.out.println(c.getFirstDayOfWeek());
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        //metodo de adicionar algo a uma constante
        c.add(Calendar.DAY_OF_MONTH, 2); //2 dias no mes a mais
        c.add(Calendar.HOUR, 5);        //5 dias na semana a mais

        Date da = c.getTime();
        System.out.println(da);
    }
}
