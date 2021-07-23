package queues.priorityQ;
import java.util.*;
public class Main {
    public static void main(String args[]){
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.add("Vishwas");
        q.add("Nishchay");
        q.add("Manish");
        System.out.println("head: "+q.element());
        System.out.println("head: "+q.peek());
        Iterator<String> it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        q.remove();
        q.poll();
        System.out.println("Removed two elements");
        it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
