package QuanLiTruongDaiHoc;

public abstract class NhanVienCLCao extends NhanVien {
protected String trinhdo; // Trinh do
protected String nganh; // Nganh 
protected String noiDaoTao; // Noi dao tao
public NhanVienCLCao(String ten, int namSinh, double luong, Date ngaynhanviec, PhongBan pbk, String trinhdo,
		String nganh, String noiDaoTao) {
	super(ten, namSinh, luong, ngaynhanviec, pbk);
	this.trinhdo = trinhdo;
	this.nganh = nganh;
	this.noiDaoTao = noiDaoTao;
}
//Tinh luong cua nhan vien
public abstract double tinhLuong();
}
