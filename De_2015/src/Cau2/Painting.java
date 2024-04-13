package Cau2;

public class Painting extends ArtObject{
	String paintType, style;

	public Painting(String title, String artist, int year, String paintType, String style) {
		super( title, artist, year);
		this.paintType = paintType;
		this.style = style;
	}
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String toString() {
		return super.toString() + paintType + "\t" + style + "\t";
	}
}
