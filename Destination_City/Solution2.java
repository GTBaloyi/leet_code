import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(PermutationStep(12453));
        /*System.out.println(destCity(
                List.of(
                        List.of("London","New York"),
                        List.of("New York","Lima"),
                        List.of("Lima","Sao Paulo")
                )
            )
        );*/
    }

    public static int PermutationStep(int num) {

        int[] digits = new int[10];
        while(num > 0) {
            digits[num % 10]++;
            num /= 10;
        }
        for(int i = 9; i >= 0; i--) {
            if(digits[i] > 0) {
                num = num * 10 + i;
                digits[i]--;
                break;
            }
        }
        for(int i = 9; i >= 0; i--) {
            while(digits[i] > 0) {
                num = num * 10 + i;
                digits[i]--;
            }
        }
        System.out.println(num);
        if(num == 0) return -1;
        if(num == Integer.MAX_VALUE) return -1;
        if(num == Integer.MIN_VALUE) return -1;
        if(num == Integer.MIN_VALUE + 1) return -1;
        if(num == Integer.MAX_VALUE - 1) return -1;
        if(num == Integer.MIN_VALUE + 2) return -1;
        return num;
    }


   /* public static String destCity(List<List<String>> paths) {
        String currentFinalDestination = paths.get(0).get(1);
        for(int i = 0; i < paths.size(); i++) {
            String nextCity = paths.get(i+1).get(0);
            if()
        }
    }*/
}
