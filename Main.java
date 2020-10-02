import java.util.Scanner;

/**
 *This program tells the user thir hailstone sequence
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a Scanner
    Scanner input = new Scanner(System.in);

    //asks user for a positive integer
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    //allows user to put in a positvie number
    int userNumber = input.nextInt();
    //count for the sequence
    int hailstoneCount = 0;

    //while loop with if statments
    System.out.println("Hailstone sequence is the following:");
    while(userNumber != 1){
      //if number matches 1 or not
      if(userNumber %2 == 0){
        userNumber = userNumber / 2;
        System.out.println(userNumber);
      } else {
        userNumber = userNumber * 3 + 1;
        System.out.println(userNumber);
      } 
      
    }
    
  }
}
