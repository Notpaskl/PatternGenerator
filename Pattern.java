// Class author: Pascal Somborn
//Date created: October 30th 2026
// General description: This will have a main method which calls on other methods to create a unique parttern

public class Pattern{

//Tests methods
//Precondition: User inputs how many rows they want to produce from different methods in the program
//Postcondition: Calls the methods within the main method
    public static void main(String[] args) {
        stars(7);
        triangles(9); 
        odds(9);
        eo(6);
        pyramid(5);
    }

    //Star method
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

    // triangle method
    //precondition: Requires user to input the amount of rows
    //postcondition: Prints out a triangle, with each row being represented by the number
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
//Precondtion:Requires user to input the number of odd rows they want
//Postcondition: Returns the odd number row, starting with the highest odd number to reduce to the lowest odd number row
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

//method 4 1st half
//Precondition: Requires users to input the max amount of rows
//Postcondition: Increase in the even and odd rows and decreases after hitting the max row given by user.

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

//Precondition: Requires users to input the amount of rows
//Postcondition: Returns the method starting the the lowest number in the row, descending to the max row based on user input
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
