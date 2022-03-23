import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PSWgen {
  
    public static void main(String[] args) {

	System.out.println("Benveuti al programma PSWgen!\n Questo programma ha lo scopo di creare password casuali formate da lettere maiuscole e minuscole caratteri speciali e numeri, \ndovrete semplicemente inserire la lunghezza della password ed essa verrà generata.");
	Scanner parola = new Scanner(System.in);
	char choice;
	do {
    	try {
    		  
			Scanner sc = new Scanner(System.in); 
			System.out.println("Inserire la lunghezza della password: ");
			    int len = sc.nextInt(); //chiede input per la password
				 System.out.println(GeneratePS(len)); //crea la password di lunghezza len
			    if(len<8) {
			    System.out.println("Attenzione una password inferiore a 8 caratteri è debole!");
			   
			}
		}
    	
        catch (InputMismatchException len) {  
            System.out.println("Non hai inserito un numero perfavore immetti una password valida: ");  
        
        }
  
  catch (NegativeArraySizeException len)
      {
          System.out.println("Hai inserito un numero negativo, perfavore immetti una password valida: ");
      }
    	catch(ArrayIndexOutOfBoundsException len) {
    		System.out.println("Perfavore immetti una password superiore ad'uno: ");
    	}
    	
	System.out.println("Vuoi continuare? (si/no)");
				
	choice = parola.next().charAt(0);
	} while((choice=='s'));    
	if(choice== 'n') {
		System.out.println("Il programma verrà terminato, arrivederci.");
	}
	parola.close();
	
	}
	//creare gli elementi per la passwseord 	
	private static char[] GeneratePS(int length) {
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyzèùìàéòç";
	      String specialCharacters = ",.-;:_-@#°[]{}!£$%&/()=?<>";
	      String numbers = "0123456789";
	      //creare una stringa con gli elementi combinati per la password
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	   
	      //creare una variabile Random per fare in modo di creare una cifra casuale
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
	
	
