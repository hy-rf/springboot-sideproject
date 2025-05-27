package side.side.dto;

public class AlbumDto {
    private int id;
    private String name;
    private String artist;
    private int year;

    public AlbumDto() {}

    public AlbumDto(int id, String name, String artist, int year) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}