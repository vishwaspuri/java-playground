package lists;

import java.util.*;

public class HeterogeneousList{
    public static void main(String args[]){
        List myList = new ArrayList(); //heterogeneous list 
        myList.add("dasdas");
        myList.add(2);
        myList.add("rand");
        for(int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}