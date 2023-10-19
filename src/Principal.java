import br.com.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefao";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}