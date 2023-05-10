package it.manualedijava8.cap9.anonime.pag286;

public class TestPilota {
    public static void main(String[] args) {
        Pilota pilota = new Pilota("Simone");
        pilota.fattiUnGiro(new Volante() {

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
        });
    }
}
