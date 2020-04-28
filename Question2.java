import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    
    //get user height
    System.out.println("Height: ");
    double height = in.nextDouble();
    
    //get user weight
    System.out.println("Weight: ");
    double weight = in.nextDouble();
    
    //calculate bmi
    double bmi = weight/(height*height);
      
    //print bmi
    System.out.println("BMI: ".concat(Double.toString(bmi)));
  }
}
