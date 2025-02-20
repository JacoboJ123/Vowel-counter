//this code will claculate the number of vowels in a phrase
import java.util.Scanner;
//begin program
public class H6 {
public static void main(String[]args) {
//declare scanner
Scanner scnr = new Scanner(System.in);
//get input from user
System.out.println("Enter Phrase");
String userInput = scnr.nextLine();
userInput.toLowerCase();

//declare variables
int index = 0;
int a = 0;
int e = 0;
int i = 0;
int o = 0;
int u = 0;
int total = 0;
char ch;

//while loop
while (index < userInput.length()){
   ch = userInput.charAt(index);
   
   switch (ch){
      case 'a':
         a++;
         total++;
         break;
      case 'e':
         e++;
         total++;
         break;
      case 'i':
         i++;
         total++;
         break;
      case 'o':
         o++;
         total++;
         break;
      case 'u':
         u++;
         total++;
         break;
    }
    
    index++;
    
    }
    
//print
System.out.println("The phrase is " + userInput);
System.out.println("The number of a's: " + a);
System.out.println("The number of a's: " + e);
System.out.println("The number of a's: " + i);
System.out.println("The number of a's: " + o);
System.out.println("The number of a's: " + u);
System.out.println("The total number of vowels is: " + total);

//end
}
//main
}
