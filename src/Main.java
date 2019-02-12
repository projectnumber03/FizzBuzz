public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            fizzBuzz(i);
        }
    }

    public static void fizzBuzz(int n){
        String answer = "";
        if(n % 3 == 0) answer += FizzBuzz.Fizz;
        if(n % 5 == 0) answer += FizzBuzz.Buzz;
        System.out.println(answer.equals("") ? n : answer);
    }
}
