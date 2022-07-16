package hw_12.task_1;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//+- Попробуй заменить Date (устаревший тип) на LocalDateTime и использовать форматирование даты в строку в методе toString()
public class Product {
    //может быть типа LocalDateTime
    private  Date date;

    public Product(String dateString) {
        //в конструкторе не должно быть логики
        this.date = fromString(dateString);
    }

    private Date fromString(String s){

        Date result = null;
        try{
            //не нужно каждый раз создавать форматтер - он может быть константой
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            result  = dateFormat.parse(s);
        }

        catch(ParseException e){
            e.printStackTrace();

        }
        return result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pr{" +
                "date=" + date +
                '}';
    }
}
