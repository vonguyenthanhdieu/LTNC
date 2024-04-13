package QuanLiTruongDaiHoc;

import java.util.ArrayList;

public class TruongDaiHoc {
	private ArrayList<SinhVien> dansachSinhVien;
	private ArrayList<NhanVien> dansachNhanVien;

	public TruongDaiHoc(ArrayList<SinhVien> dansachSinhVien, ArrayList<NhanVien> dansachNhanVien) {
		super();
		this.dansachSinhVien = dansachSinhVien;
		this.dansachNhanVien = dansachNhanVien;
	}
//In danh sach sinh vien
	public void inDanhSachSinhVien() {
		System.out.println("Danh sach sinh vien: ");
		for (int i = 0; i < dansachSinhVien.size(); i++) {
			System.out.println(dansachSinhVien.get(i).getTen());
		}
		System.out.println("--------------------------------------");
	}
// In danh sach nhan vien
	public void inDanhSachNhanVien() {
		System.out.println("Danh sach nhan vien: ");
		for (int i = 0; i < dansachNhanVien.size(); i++) {
			System.out.println(dansachNhanVien.get(i).getTen());
			
		}
		System.out.println("--------------------------------------");
	}
//In danh sach luong
	public void inDanhSachLuong() {
		System.out.println("Luong cua cac nhan vien la: ");
		for (int i = 0; i < dansachNhanVien.size(); i++) {
			System.out.println(
					dansachNhanVien.get(i).getTen() + " luong la: " + dansachNhanVien.get(i).getLuong() + " dong.");
		}
		System.out.println("--------------------------------------");
	}
//Tinh luong nhan vien
	public double tinhLuong(int i) {
		return dansachNhanVien.get(i).tinhLuong();
	}
//Tim nhan vien co tien luong cao nhat
	public String luongCaoNhat() {
		int index = 0;
		for (int i = 0; i < dansachNhanVien.size() - 1; i++) {
			if (dansachNhanVien.get(i).tinhLuong() > dansachNhanVien.get(i + 1).tinhLuong())
				index = i;
			else
				index = i + 1;
		}
		return "Nv luong cao nhat la: " + dansachNhanVien.get(index).ten + " " + dansachNhanVien.get(index).tinhLuong();

	}

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Nguyen Quang Thoai", 2004, 7.8f, 6.5f, 6.6f);
		SinhVien sv2 = new SinhVien("Nguyen Con Heo", 2006, 7.8f, 6.5f, 6.6f);
		NhanVien nv1 = new GiangVien("Nguyen Van A", 1968, 2000000, new Date(12, 2, 1999), new PhongBan("123", "Toan"),
				"Thac Si", "Co Khi", "PV 302", 1000000);
		NhanVien nv2 = new NVQuanLy("Nguyen Thi B", 1978, 6500000, new Date(14, 9, 2006),
				new PhongBan("001", "Phong GV Day PV"), "Tien Si", "Khoa hoc may tinh", "NLU", 2000000);
		ArrayList<SinhVien> svNLU = new ArrayList<>();
		ArrayList<NhanVien> nvNLU = new ArrayList<>();
		TruongDaiHoc nlu = new TruongDaiHoc(svNLU, nvNLU);
		Nguoi sv3 = new SinhVien("Abc", 2002, 0.1f, 0.2f, 0.3f);
		svNLU.add(sv1);
		svNLU.add(sv2);
		nvNLU.add(nv1);
		nvNLU.add(nv2);
		nlu.inDanhSachNhanVien();
		nlu.inDanhSachSinhVien();
		nlu.inDanhSachLuong();
		System.out.println(sv1.isSinhVien());
		System.out.println(nv1.isSinhVien());
		System.out.println(nlu.luongCaoNhat());
	}
}
