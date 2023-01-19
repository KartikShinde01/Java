
import java.util.*;
public class Pattern{
    public static void main(String args[]){
    Scanner k = new Scanner(System.in);
    int a;
    int b;
    int v = 5;
    for(b=1 ; b <= 5; b++){
        if (v % 2 == 1)
        for(int o =1; o <= (v/2);o++ )
        System.out.print(" ");
        else
        for(int x=0; x <= (v/2);x++)
        System.out.print(" ");
        for(int c=1 ; c <= b; c++){
            System.out.print(b+" ");
        }
        System.out.println();
        --v;
    }
    }
    
}