import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Playlist {

    private String name;
    private ArrayList<Media> list;
    private int currentMedia;

    public Playlist(String name) {
        this.name = name;
        list = new ArrayList<Media>();
        currentMedia = 0;
    }

    // getters e setters
    public String getName() {

        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public ArrayList<Media> getList() {

        return list;
    }

    public void setList(ArrayList<Media> list) {

        this.list = list;
    }

    public Media getCurrentMedia() {

        return list.get(currentMedia);
    }

    public void setCurrentMedia(int currentMedia) {

        this.currentMedia = currentMedia;
    }

    // Métodos personalizados
    public void add_media(Media media) {
        list.add(media);
    } // adicionar mídia

    public void remove_media(Media media) {
        list.remove(media);
    } // remover mídia

    public void next_media() {
        if (currentMedia < list.size() - 1) {
            currentMedia++;
        } else {
            currentMedia = 0;
        }
    } // passar para a próxima mídia

    public void previous_media() {
        if (currentMedia > 0) {
            currentMedia--;
        } else {
            currentMedia = list.size() - 1;
        }
    } // voltar à mídia anterior

    public void shuffle_medias() {
        Collections.shuffle(list);
        currentMedia = 0;
    } // misturar as mídias

    public void show_medias() {
        for (Media media : list) {
            System.out.println(media.toString());
        }
    } // mostrar as mídias

    public int size_playlist() {

        return list.size();
    } // mostrar o tamanho da playlist

    public boolean empty_playlist() {

        return list.isEmpty();
    } // verificar se está vazia

    public void play() {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        for (; currentMedia< list.size();){

            System.out.println(list.get(currentMedia).getTitle());
            System.out.println("Next | Prev");
            resposta = scanner.nextLine();
            if(resposta.equalsIgnoreCase("next")){
                next_media();
            }else if(resposta.equalsIgnoreCase("prev")){
                previous_media();
            }
        }
    } // passa as músicas da playlist
}

