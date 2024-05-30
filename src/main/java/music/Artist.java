package music;
import java.util.Objects;

/**
 * Class to store Artist data
 * @author inesperez
 */
public class Artist {

    String artisticName;

    /**
     * @param artisticName A String with the artistic name of the artist
     */
    public Artist(String artisticName)
    {
        this.artisticName = artisticName;
    }
    /**
     * default constructor
     */
    public Artist()
    {
        artisticName = " ";
    }
    /**
     * returns the artist's artistic name
     * @return artisticName Artist's artistic name
     */
    public String GetArtisticName()
    {
        return artisticName;
    }

    /**
     * Establishes the artist's artistic name
     * @param artisticName Artist's artistic name
     */
    public void SetArtisticName(String artisticName)
    {
        this.artisticName = artisticName;
    }
    /**
     * Method toString to show the Artist data
     * @return A String with all the Artist information
     */
    public String ToString() {
        return artisticName;
    }

    /**
     * Equals Method
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist artist)) return false;
        return Objects.equals(artisticName, artist.artisticName);
    }
}
