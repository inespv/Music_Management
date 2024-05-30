package Management;

import music.Song;
import java.util.ArrayList;
/**
 * Class with all the Song methods
 */
public class SongManagement {

    Song song;
    ArrayList<Song> songs;

    public SongManagement()
    {
        songs = new ArrayList<Song>();
    }
    public void AddSong()
    {
        songs.add(song);
    }
}
