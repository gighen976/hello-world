package it.thinkinginjava.esercizi.appendice.a.pag671;

public class PassReferences {
    static void f(PassReferences h, int y) {
        y++;
        System.out.println("h inside f(): "+h+" "+y);
    }

    public static void main(String[] args) {
        PassReferences p=new PassReferences();
        int i =5;
        System.out.println("p inside main(): " + p+ " "+i);
        f(p, i);
        System.out.println("p inside main(): " + p+ " "+i);

    }
}