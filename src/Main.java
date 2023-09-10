import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("My");
        list.add("Dear");
        list.add("Friends");
        List<String> list2 = list.stream().map(s -> s + " " + "Stream").toList();
        System.out.println(list2);
    }
}