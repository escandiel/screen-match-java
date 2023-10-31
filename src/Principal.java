import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.setAtiva(false);
        lost.exibeFichaTecnica();
        System.out.println("Duracao em minutos para maratonar: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("O poderoso chefao 2");
        outroFilme.setAnoDeLancamento(1974);
        outroFilme.setDuracaoEmMinutos(190);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        var filmeDoEscandi = new Filme();
        filmeDoEscandi.setDuracaoEmMinutos(200);
        filmeDoEscandi.setNome("Marvel Iron Man 3");
        filmeDoEscandi.setAnoDeLancamento(2012);
        filmeDoEscandi.avalia(10);
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    }
}