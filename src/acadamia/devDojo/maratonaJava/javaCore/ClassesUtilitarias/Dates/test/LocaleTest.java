package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.Dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {

        //pt
        Locale localItaly = new Locale("it", "IT");
        Locale localBrazil = new Locale("pt", "BR");

        //dia de hoje em milessegundos Long
        Calendar c = Calendar.getInstance();

        //formatação
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localBrazil);

        System.out.println("Tempo na Italia: " + df1.format(c.getTime()));
        System.out.println("Tempo no Brasil: " + df2.format(c.getTime()));

        System.out.println(localItaly.getDisplayCountry());
        System.out.println(localBrazil.getDisplayCountry());

        System.out.println(localItaly.getDisplayLanguage());
        System.out.println(localBrazil.getDisplayName());
    }
}
