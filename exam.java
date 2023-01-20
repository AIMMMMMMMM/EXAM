
public class exam {
public static void main(String[] args) 
   {
      // accept user input and check if number is even or odd
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      int num = input.nextInt();

      isEven(num);

      boolean divisible;
      isDivisibleByTwo = divisible;

      if(divisible == true)
         System.out.println("The integer entered is even.");
      else
         System.out.println("The integer entered is odd.");   
   }
   public static boolean isEven(int number)
   {
      // check if number is even
      int remainderByTwo = number % 2;
      boolean isDivisbleByTwo = (remainderByTwo == 0);
      return isDivisible
}
