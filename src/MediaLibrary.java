import java.util.ArrayList;
import java.util.List;

public class MediaLibrary {
    private String user;
    private Playlist[] playlists;
    private List<Media> medias;

    public MediaLibrary(String user, Playlist...playlists) {
        this.user = user;
        this.playlists = playlists;
    }

    public Playlist[] getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist[] playlists) {
        this.playlists = playlists;
    }

    // getters e setters
    public String getUser() {

        return user;
    }

    public void setUser(String user) {

        this.user = user;
    }

    public List<Media> getMedias() {

        return medias;
    }

    public void setMedias(List<Media> medias) {

        this.medias = medias;
    }

    // Métodos personalizados

    public void play_playlist(String name) {
        for (int i = 0; i< playlists.length;i++){
            if(playlists[i].getName().equalsIgnoreCase(name)){
                playlists[i].play();
            }
        }
    }

    public void add_media(Media media) {

        medias.add(media);
    } // adicionar mídia

    public void remove_media(Media media) {

        medias.remove(media);
    } // remover mídia


    public Media search_media_by_title(String title) {
        for (Media media : medias) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    } // procurar mídia pelo título

    public Playlist search_playlist_by_name(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(name)) {
                return playlist;
            }
        }
        return null;
    } // procurar playlist pelo nome
}