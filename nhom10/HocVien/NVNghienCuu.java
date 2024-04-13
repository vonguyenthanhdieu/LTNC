package HocVien;

public class NVNghienCuu extends AEmployee{
	private int phuCapDocHai;
	public NVNghienCuu(int maNV, Name tenNV, String trinhDo, int luongCoBan
			, int phuCapDocHai) {
		super(maNV, tenNV, trinhDo, luongCoBan);
		this.phuCapDocHai = phuCapDocHai;
	}
	@Override
	public int tinhLuong() {
		return this.luongCoBan + this.phuCapDocHai;
	}
}
