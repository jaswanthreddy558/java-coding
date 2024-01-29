package optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String[] strings = new String[10];
        Optional<String> string = Optional.ofNullable(strings[5]);
        if (string.isPresent()){
            
        }

    }
}
