package Cau2;

import java.util.ArrayList;

public class BaoTang {
	ArrayList<ArtObject> listOfSculpture;
	public BaoTang() {
		listOfSculpture = new ArrayList<ArtObject>();
	}
	//them tac pham vao list
	public void creatSculptureList(ArtObject a) {
		listOfSculpture.add(a);		
	}
	public void printList() {
		for (ArtObject s : listOfSculpture) {
			System.out.println(s.toString());
		}
	}
	//Sắp xếp danh sách các tác phẩm điêu khắc theo tên tác phẩm
	public void sortSculptureList() {
		for (int i= 0; i< listOfSculpture.size() -1; i++) {
			for (int j= i+1; j< listOfSculpture.size(); j++) {
				ArtObject scuI = listOfSculpture.get(i);
				ArtObject scuJ = listOfSculpture.get(j);
				if (scuI.getTitle().compareTo(scuJ.getTitle()) > 0 ) {
					scuJ = listOfSculpture.remove(j);
					listOfSculpture.add(i,scuJ);
				}
			}
		}
	}
	public static void main(String[] args) {
		BaoTang baotang = new BaoTang();
		
		ArtObject s1 = new Sculpture("Phụ nữ ngồi thiền", "Paige Bradley", 1998	, "Sáp", 1.3, 50);
		ArtObject s2 = new Sculpture("Con người miền sông nước", "Fah Cheong", 1972	, "Đồng", 10.5, 100);
		ArtObject s3 = new Sculpture("Bức tượng De Vaortkapoen", "Tom Frantzen", 1956	, "Đồng", 2.5, 35);
		ArtObject s4 = new Sculpture("Bức tượng sáp Expansion", "Paige Bradley", 0	, "Sáp", 4.5, 67);
		ArtObject s5 = new Sculpture("Bruno Catalano", "Botero", 0	, "Đồng", 5.7, 78);
		
		//list cac tac pham dieu khac
		baotang.creatSculptureList(s1);
		baotang.creatSculptureList(s2);
		baotang.creatSculptureList(s3);
		baotang.creatSculptureList(s4);
		baotang.creatSculptureList(s5);
		
		baotang.printList();
		System.out.println("------------------------------");
		baotang.sortSculptureList();
		baotang.printList();
		}
}
