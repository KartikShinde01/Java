import java.util.*;
public class Kartik{
    public static void main(String args[]){
    Scanner k = new Scanner(System.in);
    int x;
    int y=0;
    while(y!=4){
        x = 0;
        while(x != y){
            System.out.print("*");
            x++;
        }
        System.out.println();
        y++;
    }     
    int a;
    int b=4;
    while(b!=0){
        a = b;
        while(a != 0){
            System.out.print("*");
            a--;
        }
        System.out.println();
        b--;
    }
    }
    
}