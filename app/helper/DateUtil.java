package helper;

import dto.MonthDaysDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateUtil {
    public static Date stringToDate(String date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate;
        try {
            startDate = df.parse(date);
            return startDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public static String dateToString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String startDate = "";
        startDate = df.format(date);
        return startDate;
    }
    public static String now() {
        return dateToString(new Date());
    }
    public static long currentTime() {
        return System.currentTimeMillis()/1000;
    }
    public static long getVerificationCodeExpirationTime() {
        return (System.currentTimeMillis()+1800000)/1000;
    }
    public static int daysBetweenDates(String startDateString,String endDateString){
        LocalDate startDate = LocalDate.parse(startDateString);
        LocalDate endDate = LocalDate.parse(endDateString);

        // Calculate the number of days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        return Integer.parseInt(String.valueOf(daysBetween));
    }
    public static MonthDaysDTO monthsBetweenDates(String startDate,String endDate){
        LocalDate stDate = LocalDate.parse(startDate);
        LocalDate enDate = LocalDate.parse(endDate);
        Period period = Period.between(stDate, enDate);
        int years = period.getYears();
        int totalMonths = years * 12 + period.getMonths();
        int remainingMonths = period.getMonths();
        int remainingDays = period.getDays();
        // Calculate the number of days between the two dates
        int daysBetween = daysBetweenDates(startDate, endDate);
        return new MonthDaysDTO(years,totalMonths,remainingMonths,remainingDays,daysBetween);
    }
    public static long addDaysOnDate(String date,int days){
        long d = stringToDate(date).getTime();
        long dPlus = d + (days * 24 * 60 * 60 * 1000);
        return dPlus;
    }

    public static long addYearsOnDate(String date,int years){
        LocalDate futureDate = LocalDate.parse(date).plus(years,ChronoUnit.YEARS);
        Instant futureInstant = futureDate.atStartOfDay().toInstant(ZoneOffset.UTC);
        return futureInstant.toEpochMilli();
    }


}
