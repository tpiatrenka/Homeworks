package hw_12.task_1;

import java.sql.Time;
import java.util.Date;

public class Product {
    private Date date;
    private Time time;

    public Product(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Product{" +
                "date=" + date +
                ", time=" + time +
                '}';
    }
}
