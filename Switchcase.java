import java.util.Scanner;
public class Switchcase{


        public void Add(int a,int b) {
            System.out.println("Addition of Given Numbers is :- "+(a+b));

        }
        public void Sub(int a,int b) {
            System.out.println("Substraction of Given NOs is :- "+(a-b));

        }
        public void Mul(int a,int b) {
            System.out.println("Multiplactin of Given NOS is :- "+(a*b));

        }
        public void Div(int a,int b) {
            System.out.println("Division of Given nos is :- "+(a/b));

        }
        public static void main(String args[]){
        Switchcase s = new Switchcase();
        Scanner k = new Scanner(System.in);
        String Name;
        int a,b,choice,ch;
        System.out.print("Enter Your Name:- ");
        Name = k.nextLine();


        do{
        System.out.println("Which Operation do You want to Perform ??\n1)Addition\n2)Substraction\n3)Multiply\n4)Divide ");
        choice = k.nextInt();
        System.out.print("Enter 1st Number :- ");
        a = k.nextInt();
        System.out.print("Enter 2nd Number :- ");
        b = k.nextInt();
        switch(choice){
            case 1:
                s.Add(a,b);
            break;
            case 2:
                s.Sub(a,b);
            break;
            case 3:
                s.Mul(a,b);
            break;
            case 4:
                s.Div(a,b);
            break;

        }
        System.out.println("Do u Want to Continue ??\n\tEnter 0 For (Yes)\n\tEnter 1 for (NO) :- ");
        ch = k.nextInt();

        }while(ch==0);
        System.out.println("Thanks, "+ Name);

    }

}
