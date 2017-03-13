import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Анастасия on 10.03.2017.
 */
public class Devices implements Items {
    static List<Device> devices = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Enter type brand model color price date");
        Scanner scanner = new Scanner(System.in);
        devices.add(new Device(scanner.nextLine().toString().split(" ")));
    }

    public void add(String str){
        devices.add(new Device(str.split(" ")));
    }

    @Override
    public void print() {
        for (Device d : devices) {
            System.out.println(d.toString());
        }
    }

    public static Device find(String model){
        for (Device d : devices) {
            if (d.model.equals(model)){
                return d;
            }
        }
        return null;
    }

}
