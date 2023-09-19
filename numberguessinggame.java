import java.util.*;
class Main {
  public static void main(String[] args) {
    Random randnum = new Random();
    Scanner sc = new Scanner(System.in);
    int randomnumber  = randnum.nextInt(100)+1;
    int count = 0;
    while(true){
      System.out.println("Hey User! Enter your Guess Number ");
      int playerguess = sc.nextInt();
      count++;
      if(playerguess==randomnumber){
        System.out.println("Congratulations, you've guessed the correct number!");
        // tries.");
        if(count<5){
          System.out.println("wahoo! you are geniuses " + count + " tries ");
        }else{
          System.out.print("it took you " + count + " tries.");
        }
        break;
      }else if(playerguess > randomnumber){
        System.out.println("Great job! You're getting closer! But the number is still a bit lower than your guess");
      }else{
        System.out.println("Great job! You're getting closer! But the number is still a bit higher than your guess");
      }
    }
  }
}