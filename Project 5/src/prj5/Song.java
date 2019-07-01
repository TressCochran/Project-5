package prj5;

/**
 * Song class, holding all data regarding a song.
 * 
 * @author Jonathan Rukaj (jrukaj)
 * @version 6.30.19
 */
public class Song {

    private String artistName;
    private String songName;
    private String genre;
    private String date;
    private int heard;
    private int liked;


    /**
     * Song constructor, taking in 4 parameters and setting
     * them to the fields.
     * 
     * @param artistName
     *            The name of the artist
     * @param songName
     *            The name of the song
     * @param genre
     *            The genre of the song
     * @param data
     *            The date the song was released
     */
    public Song(String artistName, String songName, String genre, String date) {
        this.artistName = artistName;
        this.songName = songName;
        this.genre = genre;
        this.date = date;
    }


    /**
     * Gets the artist's name, returning it as a string.
     * 
     * @return the artist's name
     */
    public String getArtistName() {
        return artistName;
    }


    /**
     * Gets the song name, returning it as a string.
     * 
     * @return the name of the song
     */
    public String getSongName() {
        return songName;
    }


    /**
     * Gets the song's genre, returning it as a string (that's a surprise lol).
     * 
     * @return the genre of the song
     */
    public String getGenre() {
        return genre;
    }


    /**
     * Gets the date the song was released, returning it in a string format.
     * 
     * @return the date the song was released
     */
    public String getDate() {
        return date;
    }


    /**
     * Checks for equality between two Song objects.
     * 
     * @param obj
     * @return true if the Songs are equal
     */
    public boolean equals(Object obj) {
        // Return true if the object is an instance of this
        if (this == obj) {
            return true;
        }
        // Return false if the object is null
        if (obj == null) {
            return false;
        }
        // Check to see if the objects are of the same class
        if (getClass() == obj.getClass()) {
            // If so, typecast obj to a Song object, then
            // compare their song and artist names
            Song otherSong = (Song)obj;
            return (getArtistName().equals(otherSong.getArtistName())
                && getSongName().equals(otherSong.getSongName()));
        }
        else {
            return false;
        }
    }


    /**
     * Returns a string representation of the object.
     * 
     * @return the Song, represented as a string.
     */
    public String toString() {
        // Create a new StringBuilder, and append the data to it
        StringBuilder build = new StringBuilder("[");
        build.append(songName + ", " + artistName + ", " + genre + ", " + date
            + "]");
        return build.toString();
    }
}
