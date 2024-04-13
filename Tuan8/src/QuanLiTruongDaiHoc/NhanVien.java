package QuanLiTruongDaiHoc;

public abstract class NhanVien extends Nguoi {
	protected double luong; // luong
	protected Date ngaynhanviec; // ngay nhan viec
	protected PhongBan pbk; // phong ban
	public NhanVien(String ten, int namSinh, double luong, Date ngaynhanviec, PhongBan pbk) {
		super(ten, namSinh);
		this.luong = luong;
		this.ngaynhanviec = ngaynhanviec;
		this.pbk = pbk;
	}
	public double getLuong() {
		return luong;
	}
// Tinh luong cua nhan vien
	public abstract double tinhLuong();
	
}
