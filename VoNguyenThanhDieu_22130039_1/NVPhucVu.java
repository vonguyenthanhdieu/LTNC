package HocVien;

public class NVPhucVu extends AEmployee{

	public NVPhucVu(int maNV, Name tenNV, String trinhDo, int luongCoBan) {
		super(maNV, tenNV, trinhDo, luongCoBan);
	}
	public int tinhLuong() {
		return this.luongCoBan;
	}
}
