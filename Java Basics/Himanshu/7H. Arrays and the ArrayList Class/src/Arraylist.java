import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<>();
        cars.add("Scorpio");
        cars.add("Ferrari");
        cars.add("Fortuner");
        for(String str : cars){
            System.out.println(str);
        }
    }
}
