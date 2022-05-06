package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
 for(int i=0;i<width;i++){
 System.out.print("*");
 }
 System.out.println("");   
    for(int j=2;j<height;j++){
    System.out.print("*");
        for(int k=2;k<width;k++){
        System.out.print(" ");
        }
    System.out.println("*");
    }    
    for(int i=0; i<width;i++){
    System.out.print("*");
    }
    System.out.println("");
        
    }
    
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
int i = 1;
System.out.println("*");
    do{
        System.out.print("*");
        i++;
        for(int j=1;j<i;j++){
        if (i>=2 && i<leg){
        System.out.print(" ");
        }
        else if(i==leg){
        System.out.print("*");
        }
        }
        System.out.println("*");
               
    }    
    while(i<leg);
 }
}