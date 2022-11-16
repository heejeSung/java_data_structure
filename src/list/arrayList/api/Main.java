package list.arrayList.api;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println("al = " + al);

        al.add(2, 25);
        System.out.println("index 2 add = " + al);

        al.remove(4);
        System.out.println("index 4 remove = " + al);

        al.size();
        System.out.println("size = " + al);

        al.get(2);
        System.out.println("al.get(2) = " + al.get(2));

        al.indexOf(30);
        System.out.println("al.indexOf(30) = " + al.indexOf(30));

    }
}
