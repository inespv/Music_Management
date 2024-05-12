package music;

public class Song {

    private String title;
    private String genre;
    private String album;
    private String artist;
    private int year;
    private double duration;

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
    /*public Song()
    {
       title = " ";
        genre = " ";
        album = " ";
        artist = " ";
        year = 0;
        duration = 0;
    }*/
    public String GetTitle()
    {
        return title;
    }
    public void SetTitle(String title)
    {
        this.title = title;
    }
    public String GetGenre()
    {
        return genre;
    }
    public void SetGenre(String genre)
    {
        this.genre = genre;
    }
    public String GetArtist()
    {
        return artist;
    }
    public void SetArtist(String artist)
    {
        this.artist = artist;
    }
    public int GetYear()
    {
        return year;
    }
    public void SetYear(int year)
    {
        this.year = year;
    }
    public String GetAlbum()
    {
        return album;
    }
    public void SetAlbum(String album)
    {
        this.album = album;
    }
    public double GetDuration()
    {
        return duration;
    }
    public void SetDuration(double duration)
    {
        this.duration = duration;
    }
    public  String ToString()
    {
        return "Title :" + title + " genre :" + genre + "album :" + album
                + "artist :" + artist +
                " duration :" + duration + " year :" + year;
    }
}
