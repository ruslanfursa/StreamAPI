import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("My");
        list.add("Dear");
        list.add("Friends");
        List<String> list2 = list.stream().map(s -> s + " " + "Stream").toList();
//        System.out.println(list2);

        int[] array = {2,5,7,11,45};
        array = Arrays.stream(array).map(element -> element + 10).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("My");
        set.add("Dear");
        set.add("Friends");

        System.out.println(set);

        Set<Integer> set2 = set.stream().map(element->element.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}