

public class Song {
    private int year;
    private int ID;
    private String title;
    private String artist;
    private String genre;
    public Song(String t,String a,int id,String g, int y) {

        title = t;
        artist = a;
        ID = id;
        genre = g;
        year = y;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t)
    {
        title = t;
    }
    public String getGenre()
    {
        return genre;
    }
    public void setGenre(String g)
    {
        genre = g;
    }
    public String getArtist()
    {
        return artist;
    }
    public void setArtist(String a)
    {
        artist = a;
    }
    public int getYear()
    {
        return year;
    }
    public void setTitle(int y)
    {
        year = y;
    }
    public int getID()
    {
        return ID;
    }
    public void setID(int id)
    {
        ID = id;
    }
    public String toString() {
        String str = String.format(title+","+artist+","+ID+","+genre+","+year);
        return str;
    }
}
