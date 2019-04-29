import java.util.Scanner;
/* Morgan Parker
CSCE 111
Developed on a mac
2/4/19
*/
//This art is cool because it doesnt require a steady hand
//does anyone ever really get enough sleep
class MLPe4{
  public static void main(String[] args) {

    double night = 0;
    double night1 = 1, night2 = 0, night3 = 0, night4 = 0, night5 = 0;
    double average;

    //initialize scanner
    Scanner keyboard = new Scanner(System.in);


    System.out.println(" ____  __    ____  ____  ____     ___   __   __     ___  _  _  __     __  ____  __  ____ ");
    System.out.println("/ ___)(  )  (  __)(  __)(  _ \\   / __) / _\\ (  )   / __)/ )( \\(  )   / _\\(_  _)/  \\(  _ \\");
    System.out.println("\\___ \\/ (_/\\ ) _)  ) _)  ) __/  ( (__ /    \\/ (_/\\( (__ ) \\/ (/ (_/\\/    \\ )( (  O ))   /");
    System.out.println("(____/\\____/(____)(____)(__)     \\___)\\_/\\_/\\____/ \\___)\\____/\\____/\\_/\\_/(__) \\__/(__\\_)");
    //it took me a while to realize the double parantheses thing 

    //initialize variables
    String sleep;

    System.out.println();
    System.out.println("Are you getting enough sleep?");

    System.out.print("How many hours did you sleep on Monday?: ");
    night1 = keyboard.nextInt();

    System.out.print("How many hours did you sleep on Tuesday?: ");
    night2 = keyboard.nextInt();

    System.out.print("How many hours did you sleep on Wednesday?: ");
    night3 = keyboard.nextInt();

    System.out.print("How many hours did you sleep on Thursday?: ");
    night4 = keyboard.nextInt();

    System.out.print("How many hours did you sleep on Friday?: ");
    night5 = keyboard.nextInt();
    keyboard.nextLine();


    average = (night1 + night2 + night3 + night4 + night5)/5;
    System.out.printf("You are getting %4.0f", average );
    System.out.print(" hours of sleep a night!");
    System.out.println();

    if(average >= 12){
      System.out.println("Do you even have schoolwork?");
    } else if (average >= 10) {
      System.out.println("Your time management must be amazing.");
    } else if (average >= 7) {
      System.out.println("You're getting the perfect amount of sleep!");
    } else if (average >= 5){
      System.out.println("You're right on the edge of sleep deprivation.");
    } else if (average >= 4){
      System.out.println("You are definitely not getting enough sleep.");
    } else {
      System.out.println("GET SOME SLEEP!");
    }








  }
}
