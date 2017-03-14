package deviceMarket.Item;

import java.sql.Date;

/**
 * Created by Анастасия on 11.03.2017.
 */
public class Client {
    String name;
    Date date;

    public Client(String[] str) {
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

    public String getName() {
        return name;
    }
}
