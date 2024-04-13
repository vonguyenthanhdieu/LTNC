package HocVien;

public abstract class AEmployee {
	protected int maNV;
	protected Name tenNV;
	protected String trinhDo;
	protected int luongCoBan;
	public AEmployee(int maNV, Name tenNV, String trinhDo, int luongCoBan) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.trinhDo = trinhDo;
		this.luongCoBan = luongCoBan;
	}
	public abstract int tinhLuong();
}
