package it.books.thinkinginjava.esercizi.appendice.a.pag677;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyObject implements Cloneable {
    int i;
    public Object clone() {
        Object o =null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Myobjetc can't clone");
        }
        return o;
    }
    public String toString() {
        return Integer.toString(i);
    }

}
