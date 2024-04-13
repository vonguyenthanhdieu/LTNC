package QuanLiTruongDaiHoc;

public class SinhVien extends Nguoi {
	private float diem1; //diem mon 1
	private float diem2; //diem mon 2
	private float diem3; //diem mon 3

	public SinhVien(String ten, int namSinh, float diem1, float diem2, float diem3) {
		super(ten, namSinh);
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}

	

}
