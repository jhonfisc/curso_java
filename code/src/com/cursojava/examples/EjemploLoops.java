package com.cursojava;

import java.util.ArrayList;

public class EjemploLoops {

    public static void main(String[] args) {
        ArrayList<Number> myList = new ArrayList();
        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(4);
        myList.add(5);


        boolean par;

        ArrayList<Number> copy = (ArrayList<Number>) myList.clone();
        for(int i = 0; i < myList.size(); i+=1) {
            par = (myList.get(i).doubleValue() % 2 == 0);
            for(int j = 0; j < copy.size(); j+=1) {
                if (par && !(copy.get(j).doubleValue() % 2 == 0)) {
                    myList.set(i, copy.get(j));
                    copy.remove(j);
                    break;
                } else if (!par && (copy.get(j).doubleValue() % 2 == 0)) {
                    myList.set(i, copy.get(j));
                    copy.remove(j);
                    break;
                }
            }
        }
        System.out.println(myList);
    }
}
