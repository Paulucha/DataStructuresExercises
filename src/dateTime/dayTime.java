package dateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class dayTime {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String date = sdf.format(new Date());
        System.out.println(date);
String dateOther = "2018-06-13 23:14:06";
        Date dateNext = sdf.parse(dateOther);
        System.out.println(dateNext);

        Calendar calendar = new GregorianCalendar(2018,10, 06);
       calendar.add(Calendar.MONTH, 1);
        System.out.println("Data: " + sdf.format(calendar.getTime()));



        DateFormat x= SimpleDateFormat.getDateInstance();
        System.out.println(x);



    }
}
