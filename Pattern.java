// Class author: Pascal Somborn
//Date created: October 30th 2026
// General description: This will have a main method which calls on other methods to create a unique parttern

public class Pattern{

//Tests methods
//Precondition: User inputs how many rows they want to produce from different methods in the program
//Postcondition: Returns the current
    public static void main(String[] args) {
        stars(7);
        triangles(9); 
        odds(9);
        eo(6);
        pyramid(5);
    }

    //Makes rows for stars
    //pre condition: User needs to input amount of rows
    //post condition: Prints out the given rows with each star being equal to the row number
    


    public static void stars(int rows){
        
        String star = "*";
        int i = 0;

        while(i<=rows){
            System.out.println(star);
            star+="**";
            i++;
        }
    }

    //makes rows for triangle
    //precondition: Requires user to input the amount of rows so that 
    //postcondition: 
    public static void triangles(int rows){
        int triangle = 0;
        int i = 0;
        String displayTriangle = "";
        while(triangle<rows){
           
            displayTriangle = "";
            i = 0;
            triangle++;

         while(i<triangle){
            displayTriangle+=triangle;
            i++;
            }
            System.out.println(displayTriangle);
        }
        
        
    }
//Odd method
    public static void odds(int start){
        String displayOddNum = start + "";
        for(int i = start; i >=1; i-=2){
            displayOddNum= "";
            for(int num = i ; num > 0; num--){
                displayOddNum += i;
            }
            System.out.println(displayOddNum);
        }
       
        //System.out.println(displayOddNum);
    }

//method 4
//Precondition: 
//Postcondition: 
//Idea: Make a for loop and put an if statement which checks if row is even,print e, else if row is odd, print o
//Idea 2:Make an if statement checking if letter start with O or E and put for loop for both true and false statement

public static void eo(int maxE){
String output= "E";

if (maxE %2 ==0){
    output= "O";
}

for(int i = 1; i<=maxE; i++ )
    {
  for(int j = 0; j<i ; j++){
    System.out.print(output);
  }  
  System.out.println();

  if (output.equals("E")){
    output = "O";
  }
  else{
    output = "E";
  } 

}
//2nd half of method 4
   for(int i = maxE-1; i>0; i-- )
    {
  for(int j = 0; j<i ; j++){
    System.out.print(output);
  }  
  System.out.println();

  if (output.equals("E")){
    output = "O";
  }
  else{
    output = "E";
  } 

}
}

//Precondition: 
//Postcondition:
//Method 5
public static void pyramid(int rows){
String print = "";
int displayNum = 0;
for (int i = 1; i<rows*2; i += 2){
    print = "";
    displayNum += 1;
    for (int j = 1 ; j< displayNum; j++){
        print+= " ";
    }
    for (int k = 0; k<(rows*2)-i ;k++){
        print += displayNum;
    }
    System.out.println(print);
}
}


}
