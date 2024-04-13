package QuanLiTruongDaiHoc;

public class NVQuanLy extends NhanVienCLCao{
private double phucapChucVu; //phu cap chuc vu

public NVQuanLy(String ten, int namSinh, double luong, Date ngaynhanviec, PhongBan pbk, String trinhdo, String nganh,
		String noiDaoTao, double phucapChucVu) {
	super(ten, namSinh, luong, ngaynhanviec, pbk, trinhdo, nganh, noiDaoTao);
	this.phucapChucVu = phucapChucVu;
}
// Tinh luong quan li
@Override
public double tinhLuong() {
	return luong+ phucapChucVu;
}

}
