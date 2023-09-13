import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(12);
        list.add(10);
        list.add(3);
        list.add(1);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("My");
        list2.add("Dear");
        list2.add("Friends");

        String result2 = list2.stream().reduce((accumulator, element) ->
                accumulator + "!!!  " + element).get();
        System.out.println(result2);

        List<Integer> list3 = new ArrayList<>();
        Optional<Integer> opt = list3.stream().reduce((accumulator, element) ->
                accumulator + element);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else {
            System.out.println("Not present");
        }
    }
}
