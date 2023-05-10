package it.manualedijava8.cap9.anonime.pag286;

public class TestVolanteAnonymous {
    public static void main(String[] args) {
        Volante ufo = new Volante() {
            @Override
            public void plana() {
                System.out.println("plana");
            }

            @Override
            public void decolla() {

                System.out.println("decolla");
            }

            @Override
            public void atterra() {
                System.out.println("atterra");

            }
        };
        ufo.decolla();
        ufo.plana();
        ufo.atterra();
    }
}
