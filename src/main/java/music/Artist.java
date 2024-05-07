package music;
import java.util.Objects;

public class Artist {

    String artisticName;

    public Artist(String artisticName)
    {
        this.artisticName = artisticName;
    }
    public Artist()
    {
        artisticName = " ";
    }
    public String GetArtisticName()
    {
        return artisticName;
    }
    public void SetArtisticName(String artisticName)
    {
        this.artisticName = artisticName;
    }
    public String ToString() {
        return "Artistic name :" + artisticName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist artist)) return false;
        return Objects.equals(artisticName, artist.artisticName);
    }
}
