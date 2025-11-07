import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();

        boolean result = isPalindrome(num);
        if(result){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }   
        }
    
    public static boolean isPalindrome(int num){
        int reverseNum = reverse(num);
        return num == reverseNum;
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }

}
