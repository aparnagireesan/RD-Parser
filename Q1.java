import java.util.*;

class Q1 {
  int i = 0;
  boolean S(String input) {
    boolean a;
    if(input.charAt(i) == 'c') {
      advance();
      a = A(input);

      if(a == true) {
        advance();

        if(input.charAt(i) == 'd') {
          return true;
        }
        else {
          return false;
        }
      }
      return false;
    }
    return false;
  }

  boolean A(String input) {
    if(input.charAt(i) == 'a') {
      advance();
      if(input.charAt(i) == 'b') {
        return true;
      }
      else {
        return false;
      }
    }
    else if(input.charAt(i) == 'd') {
      return true;
    }
    else {
      return false;
    }
  }

  void advance() {
    i++;
  }
}



class Main1 {
  public static void main(String[] args) {
    boolean s;
    String input;
    Scanner sc = new Scanner(System.in);
    Q1 ob = new Q1();

    System.out.println("Enter your string");
    input = sc.next();
    s = ob.S(input);

    if(s == true) {
      System.out.println("Accepted");
    }
    else {
      System.out.println("Rejected");
    }
  }
}
