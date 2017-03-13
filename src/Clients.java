import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Анастасия on 11.03.2017.
 */
public class Clients implements Items {
    static List<Client> clients = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Enter name date of birthday");
        Scanner scanner = new Scanner(System.in);
        clients.add(new Client(scanner.nextLine().split(" ")));
    }

    public void add(String str) {
        clients.add(new Client(str.split(" ")));
    }

    @Override
    public void print() {
        for (Client d : clients) {
            System.out.println(d.toString());
        }
    }

    public static Client find(String name) {
        for (Client c : clients) {
            if (c.name.equals(name)) {
                return c;
            }
        }
        return null;
    }
}
