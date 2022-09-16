package calendar.application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
       /* cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime(); */
        int minutos = cal.get(Calendar.MINUTE);
        int mes = cal.get(Calendar.MONTH) + 1;
        System.out.println("Minutos: " + minutos);
        System.out.println("Mes: " + mes);

    }
}
