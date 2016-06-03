import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Stack;

public class MaximumElement {

    public static void main(String[] args) {
        //int[] array = new int[N];
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Stack S = new Stack();
        Stack max_stack = new Stack();
        int N = in.nextInt();
        //int max = 0;
        for (int i=0;i<N;i++){
            int r =in.nextInt();
            if (r==1){
                int k = in.nextInt();
                S.push(k);
                //if (max_stack.isEmpty())
                  //  max_stack.push(k);
                //int r = int max
                //int a1 = (Integer) S.peek();
                int a2;
                if (max_stack.isEmpty()){
                    a2 = 0;}
                else{
                    a2 = (Integer) max_stack.peek();
                }
                if (k>=  a2){
                    max_stack.push(k);}
                else 
                    max_stack.push((Integer) max_stack.peek());
               
            }
            else if (r==2){
                //if ((Integer) S.peek()==(Integer) max_stack.peek() && !max_stack.isEmpty())
                max_stack.pop();
                S.pop();
                 
                
            }
            else {
                System.out.println(max_stack.peek());
            }
            
        }
        
    }
}
