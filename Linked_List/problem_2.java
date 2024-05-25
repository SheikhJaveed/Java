//program to take LinkedList elements as input and delete the numbers greater than 25
import java.util.LinkedList;
import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<11;i++){
            list.add(sc.nextInt());
        }

        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)>25){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
