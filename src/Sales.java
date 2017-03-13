import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Анастасия on 11.03.2017.
 */
public class Sales implements Items {
    List<Sale> sales = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Enter client's name date and devices");
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(scanner.nextLine());
        String str;
        while (!(str = scanner.nextLine()).equals("--")) {
            sb.append(" " + str);
        }
        sales.add(new Sale(sb.toString().split(" ")));
    }

    public void add(String str) {
        sales.add(new Sale(str.split(" ")));
    }

    @Override
    public void print() {
        for (Sale d : sales) {
            System.out.println(d.toString());
        }
    }
}
