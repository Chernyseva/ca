import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Анастасия on 10.03.2017.
 */
public class Sale {
    Client client;
    Map<Device, Integer> items = new HashMap<>();
    Date date;

    Sale(String[] str) {
        client = Clients.find(str[0]);
        date = Date.valueOf(str[1]);
        for (int i = 2; i + 1 <= str.length; i++) {
            items.put(Devices.find(str[i]), Integer.valueOf(str[i + 1]));
            i++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + client.shortInfo() + " ");
        sb.append(date + " ");
        float price = 0;
        for (Map.Entry<Device, Integer> e : items.entrySet()) {
            sb.append("\n" + e.getKey().shortInfo() + " " + e.getValue().intValue());
            price += e.getKey().getPrice() * e.getValue().intValue();
        }
        sb.append("\nPrice:" + price);
        return sb.toString();
    }
}
