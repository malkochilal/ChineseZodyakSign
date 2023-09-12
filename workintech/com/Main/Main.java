package workintech.com.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int age=input.nextInt();
        int result=age % 12;

String animal="";

        System.out.println(result);

switch(result){
    case 0:
      animal="Monkey";
        break;
    case 1:
        animal="Rooster";
        break;
    case 2:
       animal="Dog";
        break;
    case 3:
       animal="Pig";
        break;
    case 4:
        animal="Rat";
        break;
    case 5:
       animal="Ox";
        break;
    case 6:
        animal="Tiger";
        break;
    case 7:
     animal="Rabbit";
        break;
    case 8:
   animal="Dragon";
        break;
    case 9:
      animal= "Snake";
        break;
    case 10:
    animal="Horse";
        break;
    case 11:
       animal="Goat";
        break;



}
        System.out.println("Your Chinese Zodiac Sign :"+animal);
    }
}
