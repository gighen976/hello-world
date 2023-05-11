package it.manualedijava8.cap9.anonime.pag289;

import lombok.Getter;
import lombok.ToString;

public enum Genere {
    Poliziesco,
    Fantascienza,
    Sentimentale,
    Horror;


    public String value() {
        return name();
    }


}
