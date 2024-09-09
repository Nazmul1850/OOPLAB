import Array.Stack;
import Array.SumAvg;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Stack: ");
        int m = sc.nextInt();
        Stack st = new Stack(m);
        while(true){
            System.out.println("Enter 1 for push 2 for pop 3 for peek 4 to quit");
            int choice = sc.nextInt();
            if(choice == 1){
                st.push(sc.nextInt());
            }else if(choice == 2){
                System.out.println(st.pop());
            } else if (choice == 3) {
                System.out.println(st.peek());
            } else if (choice == 4) {
                break;
            }
        }
    }
}