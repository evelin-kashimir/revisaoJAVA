package acadamia.devDojo.maratonaJava.javaCore.ClassesUtilitarias.Dates.test;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        //Classe Abstrata, não pode utilizar o new
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        //Execute para facilitar o entendimento
        for(DateFormat dateFormat : df){
            System.out.println(dateFormat.format(c.getTime()));
        }

    }
}
