package HocVien;

public class NVQuanLy extends AEmployee {
	private String chuyenMon;
	private int phuCapChucVu;
	public NVQuanLy(int maNV, Name tenNV, String trinhDo, int luongCoBan, 
			String chuyenMon, int phuCapChucVu) {
		super(maNV, tenNV, trinhDo, luongCoBan);
		this.chuyenMon = chuyenMon;
		this.phuCapChucVu = phuCapChucVu;
	}
	@Override
	public int tinhLuong() {
		return this.luongCoBan + this.phuCapChucVu;
	}

}
