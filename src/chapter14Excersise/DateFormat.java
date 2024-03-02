package chapter14Excersise;

import java.time.Month;

public class DateFormat {

    public static String formartDate(String date) {
        if(!date.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}"))throw new RuntimeException("Invalid date format(month/date/year)");
        String value = "";
        String [] dates = date.split("/");
        if(Integer.parseInt(dates[0]) <= 12 && Integer.parseInt(dates[1] ) <=31){
            String month = Month.of(Integer.parseInt(dates[0])).toString();
            String month1 =month.charAt(0)+month.substring(1).toLowerCase();
            value = String.format("""
                        %s %s, %s""",month1,dates[1],dates[2]);}
      return value;
    }
}
