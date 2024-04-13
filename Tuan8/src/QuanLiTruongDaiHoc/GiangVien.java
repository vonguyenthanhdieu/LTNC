package QuanLiTruongDaiHoc;

public class GiangVien extends NhanVienCLCao {
	private double thulaoGG; //thu lao giang day

	public GiangVien(String ten, int namSinh, double luong, Date ngaynhanviec, PhongBan pbk, String trinhdo,
			String nganh, String noiDaoTao, double thulaoGG) {
		super(ten, namSinh, luong, ngaynhanviec, pbk, trinhdo, nganh, noiDaoTao);
		this.thulaoGG = thulaoGG;
	}
 //Tinh luong cau giang vien
	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return this.luong + this.thulaoGG;
	}

}
