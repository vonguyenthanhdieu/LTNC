package QuanLiTruongDaiHoc;

public abstract class Nguoi {
	protected String ten; // ten
	protected int namSinh; // nam sinh
	public Nguoi(String ten, int namSinh) {
		super();
		this.ten = ten;
		this.namSinh = namSinh;
	}
	public String getTen() {
		return ten;
	}
//kiem tra nguoi co phai la sinh vien hay khong
	public boolean isSinhVien() {
		return (this != null) && (this instanceof SinhVien);
	}
}
