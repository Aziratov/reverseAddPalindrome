import java.util.Scanner;

public class Sort {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    String checkNum = Integer.toString(num);
    int newNum = Integer.parseInt(checkNum);

    while(isPalindrome(checkNum) == false) {
      newNum += returnReverse(checkNum);
      checkNum = Integer.toString(newNum);
      System.out.println(newNum + ":newNum");
      System.out.println(isPalindrome(checkNum));
    }

  }

  public static int returnReverse (String num) {
    // returns the REVERSE of given string
    String newString = "";
    for (int i = num.length() - 1; i >= 0; i--) {
      newString += num.charAt(i);
    }
    return Integer.parseInt(newString);
    
  }

  static boolean isPalindrome(String str) { 
    int i = 0, j = str.length() - 1; 
    while (i < j) { 
      // If there is a mismatch 
      if (str.charAt(i) != str.charAt(j)) 
          return false; 
      i++; 
      j--; 
    } 
      // Given string is a palindrome 
      return true; 
  }
}
