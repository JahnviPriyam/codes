public class Solution {
      public boolean isPalindrome(String s) {
          int i = 0, j = s.length() - 1;
          while (i < j) {
              char ci = s.charAt(i);
              char cj = s.charAt(j);
              if (!Character.isLetterOrDigit(ci)) {
                  i++;
              } else if (!Character.isLetterOrDigit(cj)) {
                  j--;
              } else if (Character.toLowerCase(ci) == Character.toLowerCase(cj)) {
                  i++;
                  j--;
              } else {
                  return false;
              }
          }
          return true;
      }
  }
      