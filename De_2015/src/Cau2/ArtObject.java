package Cau2;

public abstract class ArtObject {
	protected String artist;
	protected int year;
	protected String title;
	protected String description;
	public ArtObject(String title, String artist, int year) {
		super();
		this.artist = artist;
		this.year = year;
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//in tac pham
	public String toString() {
		return title + "\t" + artist + "\t" +  year + "\t";
	}
	
}
