package aws.function;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ToLowerCase implements Function<String, String> {

    @Override
    public String apply(String s) {
        return new StringBuilder(s).toString().toLowerCase();
    }
}

