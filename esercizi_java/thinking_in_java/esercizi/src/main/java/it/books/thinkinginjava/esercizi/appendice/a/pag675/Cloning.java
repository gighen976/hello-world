package it.books.thinkinginjava.esercizi.appendice.a.pag675;

import java.util.ArrayList;
import java.util.Iterator;

public class Cloning {
    public static void main(String[] args) {
        ArrayList v= new ArrayList();
        for (int i = 0; i < 10; i++) {
            v.add(new Int(i));
        }
        System.out.println("v : "+v);
        ArrayList v2 = (ArrayList) v.clone();
        for (Iterator e= v2.iterator(); e.hasNext();) {
            ((Int) e.next()).increment();
        }
        System.out.println("v : "+v);
    }
}
