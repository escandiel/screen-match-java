package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
