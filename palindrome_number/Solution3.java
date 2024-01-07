public class Solution3 {

    //converting x to string
    public boolean isPalindrome(int x) {
        String stringifyInput = String.valueOf(x);
        String reversedString = new StringBuilder(stringifyInput)
                .reverse()
                .toString();
        return stringifyInput.equals(reversedString);
    }

    //other solution with research
    // I do not understand this solution
    public boolean isIntPalindrome(int x) {
        if(x < 0) return false;
        int reversed = 0;
        int original = x;
        while(x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
}
