import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<BigInteger> arraySums = new ArrayList<BigInteger>();

        for(int i = 0; i < arr.size(); i++) {
            BigInteger sum = new BigInteger("0");
            for(Integer value: arr) {
                if(!Objects.equals(value, arr.get(i))) {
                    sum = sum.add(BigInteger.valueOf(value));
                }
            }
            System.out.println(sum);
            arraySums.add(sum);
        }
        Collections.sort(arraySums);
        System.out.printf(arraySums.get(0) + " " + arraySums.get(arraySums.size()-1));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = List.of(5, 5, 5, 5, 5);

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
