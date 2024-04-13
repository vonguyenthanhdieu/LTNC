package Cau2;

public class Sculpture extends ArtObject{
	String materialFrom;
	double height, weight;
	public Sculpture(String title, String artist, int year, String materialFrom, double height,
			double weight) {
		super(title, artist, year);
		this.materialFrom = materialFrom;
		this.height = height;
		this.weight = weight;
	}
	public String getMaterialFrom() {
		return materialFrom;
	}
	public void setMaterialFrom(String materialFrom) {
		this.materialFrom = materialFrom;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString() {
		return super.toString() + materialFrom + "\t" + height + "m\t" + weight + "kg\t";
	}
}
