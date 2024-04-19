import java.util.*;

public class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner ( System.in );
   System.out.print( "name: " );
   String name = input.next();
   int num = name.length();
   for (int i = 0; i < num; i++) {
     System.out.println( ( i + 1 ) + ". " + name);
   } } } 

  