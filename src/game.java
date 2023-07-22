
import static java.lang.System.out;
import java.util.Scanner;

interface FirstInterface {
  public void phrase1(); // interface method
}

interface SecondInterface {
  public void phrase2();
   
}

interface ThirdInterface {
   public void phrase3();
}
class DemoClass implements FirstInterface, SecondInterface,ThirdInterface {
  public void phrase1() {
    System.out.println("Do you know that 'Googol is the term used for the number 1 followed by 100 Zeros and was first used by a nine-year old, Milton Sirrota in 1940 ' ");
  }
  public void phrase2() {
    System.out.println("Do you know that 'When you multiply 111,111,111 by 111,111,111, you ger 12,345,678,987,654,321'");
  }
   public void phrase3() {
    System.out.println("Pluss (+) and Minus(-) signs were first used by mathematicians in the sixteenth century");
  }
  
}




// DemoClass "implements" FirstInterface and SecondInterface


class game {
  public static void main(String[] args) {
DemoClass phrase = new DemoClass();

 
 
Scanner keyboard = new Scanner(System.in);









out.print("Enter A Name: ");
String name = keyboard.next();


out.println( "This is a solving game you choose the correct answer then you enter the next round");
  out.println("------------------------------------------------------------------------------------------");
out.println( "Answer should be in capslock");



  out.println("------------------------------------------------------------------------------------------");
out.println( name + " " +  "what is the asnwer in 99 x 45 ?");
out.println("A.4,455        B.2,445        C.4,545");


String verse = keyboard.next();
////
switch (verse) {
    case "A":

 
  out.println(name + " " + " Your Answer Is Correct ");
  out.println("------------------------------------------------------------------------------------------");
  phrase.phrase1();
    out.println("------------------------------------------------------------------------------------------");
 
  out.println( name + " " +  "what is the asnwer in 10 X 50 ?");
  out.println("A.500        B.250        C.300");
   String QWE = keyboard.next();
  switch (QWE) {
                                    case "A":
                                        out.println(name + " " + " Your Answer Is Correct ");
                                          out.println("------------------------------------------------------------------------------------------");
                                       phrase.phrase2();
                                       
                                 
                                     
                                       out.println( name + " " +  "what is the asnwer in 10 + 50 ?");
                                            out.println("A.60        B.40        C.70");
                                              String RTY = keyboard.next();

                                         
                                         
                                         
                                         switch (RTY) {
                                                
                                             
                                       case "A":
                                        out.println(name + " " + " Your Answer Is Correct ");
                                        out.println("------------------------------------------------------------------------------------------"); 
                                         phrase.phrase3();
                                          out.println("------------------------------------------------------------------------------------------");
                                         
                                          out.println(name + " " + " Thanks for playing the game :)");
                                         break;
                                          
                                    case "B":
                                         out.println("Wrong Answer");   
                                             out.println("------------------------------------------------------------------------------------------");
  
       

    break;

                                    case "C":
                                         out.println("Wrong Answer");   
                                             out.println("------------------------------------------------------------------------------------------");

 

    break;

    default:

out.println("Wrong Input");

    break;

}

keyboard.close();
   
                                         
                                                                                                                                                                                                                                                                                                 
                                         
                                         
                                         
                                     break;     
                                         
              
                                    case "B":
                                         out.println("Wrong Answer");   
                                           out.println("------------------------------------------------------------------------------------------");
  
       

    break;

                                    case "C":
                                         out.println("Wrong Answer");   
                                       out.println("------------------------------------------------------------------------------------------");

 

    break;

    default:

out.println("Wrong Input");

    break;

}


keyboard.close();
   
///
break;

case "B":
  
    out.println("Wrong Answer");   
      out.println("------------------------------------------------------------------------------------------");

break;
/////
case "C":
    
     out.println("Wrong Answer"); 
       out.println("------------------------------------------------------------------------------------------");
 

break;

default:

out.println("Wrong Input");
  out.println("------------------------------------------------------------------------------------------");

break;

}



keyboard.close();

}

}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  

