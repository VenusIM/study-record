package ch08.item50;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        Period period = new Period(date);
        System.out.println(period);
        date.setDate(15);
        System.out.println(period);
    }

    private static class Period {
        private Date date;

        public Period(Date date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Period{" +
                    "date=" + date +
                    '}';
        }
    }
}
