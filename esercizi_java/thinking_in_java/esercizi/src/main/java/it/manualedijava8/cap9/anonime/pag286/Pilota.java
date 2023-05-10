package it.manualedijava8.cap9.anonime.pag286;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Pilota {
    private String nome;

    public void  fattiUnGiro(Volante volante) {
        volante.decolla();
        volante.plana();
        volante.atterra();
    }

}
