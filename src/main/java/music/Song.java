package music;

/**
 * Class to store Song data
 * @author inesperez
 */

public class Song {

    private String title;
    private String genre;
    private String album;
    private String artist;
    private int year;
    private double duration;

    /**
     * @param title A String with the album title
     * @param genre A String with the album genre
     * @param album A String with the album name
     * @param artist A String with the artist name
     * @param year An integer with the release date
     * @param duration A double with the duration of the album
     */

    public Song(String title, String genre, String artist,
                   int year, String album, double duration)
    {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
        this.year = year;
        this.album = album;
        this.duration = duration;
    }
    /**
     * default constructor
     */
    public Song()
    {
       title = " ";
       genre = " ";
       album = " ";
       artist = " ";
       year = 0;
       duration = 0;
    }
    /**
     * returns the song's title
     * @return Song's title
     */
    public String GetTitle()
    {
        return title;
    }

    /**
     * Establishes the song's title
     * @param title Song's title
     */
    public void SetTitle(String title)
    {
        this.title = title;
    }

    /**
     * returns the song's genre
     * @return genre Song's genre
     */
    public String GetGenre()
    {
        return genre;
    }
    /**
     * Establishes the song's genre
     * @param genre  Song's genre
     */
    public void SetGenre(String genre)
    {
        this.genre = genre;
    }

    /**
     * returns the song's artist
     * @return artist
     */
    public String GetArtist()
    {
        return artist;
    }

    /**
     * Establishes the song's artist
     * @param artist Song's artist
     */
    public void SetArtist(String artist)
    {
        this.artist = artist;
    }
    /**
     * returns the song`s release year
     * @return year Song's release year
     */
    public int GetYear()
    {
        return year;
    }

    /**
     * Establishes the song's release year
     * @param year Song's release year
     */
    public void SetYear(int year)
    {
        this.year = year;
    }

    /**
     * returns the song's album name
     * @return album Song's name
     */
    public String GetAlbum()
    {
        return album;
    }

    /**
     * Establishes the song's album
     * @param album Song's album
     */
    public void SetAlbum(String album)
    {
        this.album = album;
    }
    /**
     * returns the song's duration
     * @return Song's duration
     */
    public double GetDuration()
    {
        return duration;
    }
    /**
     * Establishes the song's duration
     * @param duration Song's duration
     */
    public void SetDuration(double duration)
    {
        this.duration = duration;
    }
    /**
     * Method toString to show the Song data
     * @return A String with all the Song information
     */
    public  String ToString()
    {
        return title + ":" + genre + ":" + ":" + album
                + ":" + artist +" :"
                + duration + ":" + year;
    }
}