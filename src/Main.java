import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //filmes
        Movies movie1 = new Movies("O Homem do Futuro",2011,"Ficção científica/Comédia",106,"Longa metragem", new String[]{"Wagner Moura","Alinne Moraes","(Fernando Ceylão","Maria Luisa Mendonça", "Gabriel Braga Nunes"},"Cláudio Torres","Conspiração Filmes");
        Movies movie2 = new Movies("Tudo em Todo Lugar ao Mesmo Tempo",2022,"Ficção científica/Aventura",139,"Longa metragem", new String[]{"Michelle Yeoh","Stephanie Hsu","Ke Huy Quan","Jenny Slate","Harry Shum Jr.","James Hong","Jamie Lee Curtis"},"Daniel Kwan","Irmãos Russo");
        Movies movie3 = new Movies("A Princesa e o Sapo",2009,"Animação",89,"Longa metragem", new String[]{"Anika Noni Rose","Bruno Campos","Keith David","Oprah Winfrey"},"Ron Clements","Peter Del Vecho");
        Movies movie4 = new Movies("20 e Poucos",2021,"Animação",10,"Curta metragem", new String[]{"Kaylin Price Ariana Brown","Aliyah Taylor","Janelle Lasalle","Napoleon Highbrou"},"Aphton Corbin","Erik Langley");
        Movies movie5 = new Movies("Alguém Especial",2019,"Romance/Comédia",92,"Longa Metragem", new String[]{"Gina Rodriguez","Brittany Snow","DeWanda Wise","LaKeith Stanfield",""},"Jennifer Kaytin Robinson","Feigco Entertainment");

        //atores
        Actor actor1 = new Actor("Wagner Moura", "27/06/1976", "Globo De Ouro Melhor Ator", "Masc", "Teatro");
        Actor actor2 = new Actor("Gina Rodriguez", "30/07/1984", "Golden Globe Awards", "Fem", "Cinema");
        Actor actor3 = new Actor("Leonardo DiCaprio", "11/11/1974", "Oscar", "Masc", "Cinema");
        Actor actor4 = new Actor("Brad Pitt", "18/12/1963", "Golden Globe Awards", "Masc", "Cinema");
        Actor actor5 = new Actor("Margot Robbie", "02/07/1990", "Golden Globe Awards", "Fem", "Cinema");

        //músicas
        Music music1 = new Music("Find Someone Like You", 2019, "R&B/Soul", 3.27, "Snooh Allegra","Ugh, Those Feels Again",5);
        Music music2 = new Music("You da One", 2011, "Pop", 3.29, "Rihanna","Talk That Talk",5);
        Music music3 = new Music("Make It Better", 2019, "R&B/Soul", 3.42, "Anderson Paak.","Ventura",5);
        Music music4 = new Music("Leal", 2019, "Hip-Hop/rap", 3.43, "Djonga","Ladrão",4);
        Music music5 = new Music("Planos", 2018, "Hip-Hop/rap", 3.39, "Bk","Gigantes",4);

        //músicos
        Musician musician1 = new Musician("Bruno Mars", "08/12/1985", "Grammy Awards", "Masc", "Vocal");
        Musician musician2 = new Musician("Rihanna", "20/02/1988", "Academy Awards", "Fem", "Vocal");
        Musician musician3 = new Musician("Anderson Paak.", "08/02/1986", "Grammy Awards", "Masc", "Vocal");
        Musician musician4 = new Musician("Seu Jorge", "08/06/1970", "1994", "Latin Grammy Award", "Vocal");
        Musician musician5 = new Musician("The Weeknd", "16/02/1990", "Grammy Awards", "Masc", "Vocal");

        //
        //
        //


        Playlist dengo = new Playlist("dengo");


        dengo.add_media(music2);
        dengo.add_media(music5);
        dengo.add_media(movie5);

        Playlist love = new Playlist("love");
        love.add_media(movie1);
        love.add_media(music1);
        love.add_media(movie3);

        //buscar alguns resultados
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getYear());
        System.out.println(movie1.getDuration());



        MediaLibrary library = new MediaLibrary("renatinha",dengo,love);
        library.play_playlist("dengo");
    }
}
