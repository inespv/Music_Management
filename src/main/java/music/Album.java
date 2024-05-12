package music;

import java.util.ArrayList;

public class Album {

    protected String title;
    protected String genre;
    protected Artist artist;
    protected int year;
    protected double duration;
    protected ArrayList<Song> songs;
    protected boolean isVinyl;

    public Album(String title, String genre, Artist artist, int year, double duration,boolean isVinyl) {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
        this.isVinyl=isVinyl;
    }
    public Album(){
        title = " ";
        genre = " ";
        artist = new Artist();
        year = 0;
        duration = 0;
        isVinyl = false;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public  String ToString(){
        return "Title :" + title + " genre :" + genre +
                 "artist :" + artist + " duration :"
                + duration + " year :" + year;
    }
}
