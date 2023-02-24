// programa para converter o número total de dias em anos, meses, semanas e dias

public class Days {
    public static void main(String[] args) {
        int days, years, months, weeks;

        days = 1049;
        years = days / 365;
        days = days % 365;
        months = days / 30;
        days = days % 30;
        weeks = days / 7;
        days = days % 7;

        System.out.println("\n Years = " + years);
        System.out.println("\n Months = " + months);
        System.out.println("\n Weeks = " + weeks);
        System.out.println("\n Days = " + days);


    }

}
