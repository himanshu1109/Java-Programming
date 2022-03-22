import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();

        list.add("Audi");
        list.add("BMW");
        list.add("Mercedies");

        for (String str: list){
            System.out.println(str);
        }
    }
}
