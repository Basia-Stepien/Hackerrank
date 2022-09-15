package Java.task11_20;

import java.util.*;

public class task20_Java_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nList = new ArrayList<>();
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            nList.add(in.nextInt());
        }

        int queriesNumber = in.nextInt();
        String query;
        int index, value;

        for(int i = 1; i <= queriesNumber; i++) {
            query = in.next();
            if(query.equals("Insert")){
                index = in.nextInt();
                value = in.nextInt();
                nList.add(index,value);
            } else {
                index = in.nextInt();
                nList.remove(index);
            }
        }

        int listLength = nList.size();

        for(int i = 0; i < listLength; i++) {
            System.out.print(nList.get(i) + " ");
        }
    }

}
