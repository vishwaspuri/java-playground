package lists;
import java.util.*;

public class HomogeneousList {
    public static void main(String []args){
        List<Person> friends = new ArrayList<Person>();
        Person person;
        person = new Person("Jane", 10, "F");
        friends.add(person);
        person = new Person("Janu", 10, "F");
        friends.add(person);
        person = new Person("ane", 10, "F");
        friends.add(person);
        // for(Person i:friends){
        //     i.display();
        // }

        //************** List Iterator *******************
        Iterator<Person> itr = friends.iterator();
        while(itr.hasNext()){
            Person p = itr.next();
            System.out.println(p.getName());
        }

        friends.remove(2);
        itr = friends.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getName()); 
        }
    }
}
