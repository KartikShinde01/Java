import java.util.*;
public class Pattern2{
    public static void main(String args[]){
    Scanner k = new Scanner(System.in);
    int a;
    int b;
    int f = 7;
    int j = 4;
    for(b=0 ; b <= 9; b++){
        if(b % 2 == 0){
        for(int w=0; w<=(f-b-j);w++)
        System.out.print(" ");
        for(int c=0 ; c <= b; c++){
            System.out.print("*");

        }
        j--;
        System.out.println();
        }
    }
    int s,t,y,z=1;
    for(s = 7; s >= 0;s-=2){
        t = s;
        y = z;
        while(y != 0){
            System.out.print(" ");
            y--;
        }
        while(t!= 0){
            System.out.print("*");
            t--;
            
        }
        System.out.println();
        z++;    
    }
    }  
}