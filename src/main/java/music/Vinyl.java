package music;

/**
 * Class that extends from Album
 * @see Album
 * @author inesperez
 */
public class Vinyl extends Album {
    /**
     * @param albumTitle A String with the album title
     * @param genre A String with the album genre
     * @param artist An Artist object with the artist name
     * @param year An integer with the release date
     * @param duration A double with the duration of the album
     * @param isVinyl A boolean to determinate if the album has (or not)
     *                vinyl version
     */
    public Vinyl(String albumTitle, String genre, Artist artist, int year, double duration,boolean isVinyl) {

        super(albumTitle,genre,artist,year,duration,isVinyl);
        this.albumTitle = albumTitle;
        this.genre = genre;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
        this.isVinyl=isVinyl;
    }
}
