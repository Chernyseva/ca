import java.sql.Date;

/**
 * Created by Анастасия on 10.03.2017.
 */
public class Client {
    String name;
    Date date;

    Client(String[] str) {
        name = str[0];
        date = Date.valueOf(str[1]);
    }

    @Override
    public String toString() {
        return name + " " + date;
    }

    ;

    public String shortInfo() {
        return name;
    }
}
