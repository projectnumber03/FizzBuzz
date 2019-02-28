import java.util.stream.IntStream;

public class MainLambda {
    public static void main(String[] args) {
        IntStream.range(1, 101).forEach(x -> System.out.println(x % 15 == 0 ? "" + FizzBuzz.Fizz + FizzBuzz.Buzz : x % 5 == 0 ? "" + FizzBuzz.Buzz : x % 3 == 0 ? "" + FizzBuzz.Fizz : String.valueOf(x)));
    }
}
