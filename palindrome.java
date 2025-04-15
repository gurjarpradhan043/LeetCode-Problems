public class palindrome {
    public boolean isPalindrome(int x) {
        
                String original = Integer.toString(x);
                String reversed = new StringBuilder(original).reverse().toString();
                return original.equals(reversed);
                
            }
       
    public static void main(String[] args) {
      palindrome palidromeChecker = new palindrome();
      boolean check = palidromeChecker.isPalindrome(121);
      System.out.println("Is a palidrome ? "+ check); 

    }
}
