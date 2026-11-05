// Class author: Pascal Somborn
//Date created: October 30th 2026
// General description: This program will...

public class Pattern{

//Tests methods
    public static void main(String[] args) {
        stars(7);
        triangles(9); 
        odds(9);
    }

    //Makes rows for stars
    //pre condition
    //post condition
    


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
        }
       
        System.out.println(displayOddNum);
    }

//method 4
//public static void eo(int maxE){

//}



//Method 5
//public static void pyramid(int rows){

//}


}
