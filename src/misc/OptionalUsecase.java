package misc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalUsecase {
    public static void main(String[] args) {
        String []arr = new String[10];
        Optional<String> checkNull = Optional.ofNullable(arr[4]);
        if (checkNull.isPresent()) {
            System.out.println(arr[4]);
        } else {
            System.out.println("null");
        }

        //determnie whether any element is availble with given criteria
        List<String> list = Arrays.asList("Ashok", "Ansh", "Ananya", "Agastya", "Tushar", "Chokhada", "Oriek", "Ghome");

        boolean available = list.stream().filter(person->person.equals("gv")).findFirst().isPresent();

        System.out.println(available);
    }
}
