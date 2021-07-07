package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> l = list.stream()
                                .filter(i -> i % 5 == 0)
                                .map(i -> i.intValue() * 5)
                                .findFirst();

        System.out.println(l.orElse(-1));
    }

    private static List<Integer> createList() {
        List<Integer> list1 = Arrays.asList(1,2,3,4,6,7,12,9);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> lists = Arrays.asList(list1, list2, list3);

        System.out.println(lists);

        List<Integer> allLists = lists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println(allLists);
        return list1;
    }
}
