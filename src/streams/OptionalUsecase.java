package java8.misc;

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
    }
}
