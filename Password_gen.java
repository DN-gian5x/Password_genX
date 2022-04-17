import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Password_gen {
  
    public static void main(String[] args) {

	System.out.println("Welcome to Password_gen!\n this program has the porpouse of creating casual passwords.");
	Scanner word = new Scanner(System.in);
	char choice;
	do {
    	try {
    		  
			Scanner sc = new Scanner(System.in); 
			System.out.println("Input the password length: ");
			    int len = sc.nextInt();
				 System.out.println(GeneratePS(len));
			    if(len<8) {
			    System.out.println("Warning, a 8 or inferior length password is insecure! ");
			   
			}
		}
    	
        catch (InputMismatchException len) {  
            System.out.println("You haven't insert a number, please insert a valid password: ");  
        
        }
  
  catch (NegativeArraySizeException len)
      {
          System.out.println("You insert a negative number, please insert a valid password: ");
      }
    	catch(ArrayIndexOutOfBoundsException len) {
    		System.out.println("Please insert a password superior to one: ");
    	}
    	
	System.out.println("Do you want to continue? (yes/no)");
				
	choice = word.next().charAt(0);
	} while((choice=='y'));    
	if(choice== 'n') {
		System.out.println("The program will be terminated, goodbye.");
	}
	word.close();
	
	}
		
	private static char[] GeneratePS(int length) {
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyzèùìàéòç";
	      String specialCharacters = ",.-;:_-@#°[]{}!£$%&/()=?<>";
	      String numbers = "0123456789";
	   
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	   	      
	      Random random = new Random();
	
	      char[] password = new char[length];
	
	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	            
	      for(int i=0; i< length; i++) {
	    	  
	    	  password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	   return password;
	
	}
	}
	
	
