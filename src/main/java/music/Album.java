package music;
/**
 * Class to store Album data
 * @author inesperez
 */
public class Album {

    protected String albumTitle;
    protected String genre;
    protected Artist artist;
    protected int year;
    protected double duration;
    protected boolean isVinyl;

    /**
     * @param albumTitle A String with the album title
     * @param genre A String with the album genre
     * @param artist An Artist object with the artist name
     * @param year An integer with the release date
     * @param duration A double with the duration of the album
     * @param isVinyl A boolean to determinate if the album has (or not)
     *                vinyl version
     */
    public Album(String albumTitle, String genre, Artist artist, int year, double duration,boolean isVinyl) {
        this.albumTitle = albumTitle;
        this.genre = genre;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
        this.isVinyl=isVinyl;
    }
    public Album(){
        albumTitle = " ";
        genre = " ";
        artist = new Artist();
        year = 0;
        duration = 0;
        isVinyl = false;
    }

    /**
     * returns the album's duration
         * @return Album's duration
         */
    public double getDuration() {
        return duration;
    }
    /**
     * Establishes the album's duration
     * @param duration Album's duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * returns the album's release year
     * @return Album's release year
     */
    public int getYear() {
        return year;
    }

    /**
     * Establishes the album's release year
     * @param year Album's year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * returns the album's artist
     * @return Album's artist
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * Establishes the album's artist
     * @param artist Album's artist
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /**
     * returns album's genre
     * @return Album's genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Establishes the album's genre
     * @param genre  Album's genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * returns the album's title
     * @return Album's title
     */
    public String getAlbumTitle() {
        return albumTitle;
    }

    /**
     * Establishes the album's title
     * @param albumTitle  Album's title
     */
    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    /**
     * Method toString to show the Album data
     * @return A String with all the Album information
     */
    public String ToString(){

        return albumTitle + ":" + genre + ":"
                + ":" + artist +" :"
                + duration + ":" + year;
    }
}
