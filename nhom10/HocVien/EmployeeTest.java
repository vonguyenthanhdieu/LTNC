package HocVien;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase{
	public void testConstructor() {
		Name nq = new Name("Nguyen Van", "A");
		Name nn = new Name("Banh Thi", "B");
		Name np = new Name("Ngo Van", "C");
		
		AEmployee q = new NVQuanLy(01, nq, "Dai hoc", 5000, "ke toan", 300);
		AEmployee n = new NVNghienCuu(02, nn, "Dai hoc", 6500, 1000);
		AEmployee p = new NVPhucVu(03, np, "cap 3", 3000);
	}
	public void testTinhLuong() {
		Name nq = new Name("Nguyen Van", "A");
		Name nn = new Name("Banh Thi", "B");
		Name np = new Name("Ngo Van", "C");
		
		AEmployee q = new NVQuanLy(01, nq, "Dai hoc", 5000, "ke toan", 300);
		AEmployee n = new NVNghienCuu(02, nn, "Dai hoc", 6500, 1000);
		AEmployee p = new NVPhucVu(03, np, "cap 3", 3000);
		
		assertEquals(q.tinhLuong(), 5300);
		assertEquals(n.tinhLuong(), 7500);
		assertEquals(p.tinhLuong(), 3000);
	}
}
