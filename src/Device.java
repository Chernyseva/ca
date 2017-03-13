import javafx.scene.paint.Color;

import java.sql.Date;

/**
 * Created by Анастасия on 10.03.2017.
 */
public class Device {
    String color;
    Type type;
    Date date;
    String brand;
    String model;
    float price;

    /*@Override
    public static Device add() {
        return new Device();
    }*/

    Device(String[] str) {
        type = Type.valueOf(str[0]);
        brand = str[1];
        model = str[2];
        color = str[3];
        price = Float.valueOf(str[4]);
        date = Date.valueOf(str[5]);
    }

    @Override
    public String toString() {
        String result = type.name() + " " + brand + " " + model + " " + color + " " + price + " " + date;
        return result;
    }

    public String shortInfo() {
        return brand + " " + model + " " + price;
    }

    public float getPrice() {
        return price;
    }
}
