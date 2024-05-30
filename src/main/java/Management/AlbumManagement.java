package Management;

import music.Album;
import java.util.ArrayList;
/**
 * Class with all the Album methods
 */
public class AlbumManagement {

    Album album;
    ArrayList<Album> albums;

    public AlbumManagement()
    {
        albums = new ArrayList<>();
    }
    public void AddAlbum()
    {
        albums.add(album);
    }
}
