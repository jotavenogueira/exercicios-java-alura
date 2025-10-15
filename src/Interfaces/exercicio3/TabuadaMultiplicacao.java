package Interfaces.exercicio3;

import org.w3c.dom.ls.LSOutput;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public String mostrarTabuada(Double valor) {
        return  valor + "* 1 = " + valor * 1 + "\n" +
                valor + "* 2 = " + valor * 2 + "\n" +
                valor + "* 3 = " + valor * 3 + "\n" +
                valor + "* 4 = " + valor * 4 + "\n" +
                valor + "* 5 = " + valor * 5 + "\n" +
                valor + "* 6 = " + valor * 6 + "\n" +
                valor + "* 7 = " + valor * 7 + "\n" +
                valor + "* 8 = " + valor * 8 + "\n" +
                valor + "* 9 = " + valor * 9 + "\n" +
                valor + "* 10 = " + valor * 10 + "\n"
                ;
    }
}