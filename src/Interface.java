import java.util.Scanner;

/**
 * Created by Анастасия on 10.03.2017.
 */
public class Interface {
    static Devices devices = new Devices();
    static Clients clients = new Clients();
    static Sales sales = new Sales();

    public static void main(String[] args) {
        System.out.println("Welcome to our application!");
        boolean exit = false;
        init();
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            String action;
            System.out.println("Choose action:");
            action = scanner.nextLine();
            if (action.equals("info")) {
                System.out.println("Press add/print device/client/sale or exit");
            } else if (action.equals("add device")) {
                devices.add();
            } else if (action.equals("add client")) {
                clients.add();
            } else if (action.equals("add sale")) {
                sales.add();
            } else if (action.equals("print device")) {
                devices.print();
            } else if (action.equals("print client")) {
                clients.print();
            } else if (action.equals("print sale")) {
                sales.print();
            } else if (action.equals("exit")) {
                exit = true;
            }
        }
        System.out.println("Good bye!");
    }

    static void init() {
        devices.add("MOBILE Nokia S40 red 99 2016-02-10");
        devices.add("TABLET Apple Air2 grey 299 2016-12-03");
        devices.add("MOBILE Apple S7 black 199 2017-02-13");
        devices.add("MOBILE Samsung A3 grey 99 2016-02-10");
        clients.add("Alexander 2001-02-10");
        clients.add("Anna 1990-03-14");
        clients.add("Marten 1988-09-14");
        sales.add("Alexander 2017-03-07 S40 4 Air2 1");
        sales.add("Alexander 2017-03-09 Air2 1");
        sales.add("Anna 2017-03-13 S7 1");
        sales.add("Marten 2017-01-10 A3 12");
    }

}
