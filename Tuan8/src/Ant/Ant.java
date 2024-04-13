package Ant;

import java.util.ArrayList;

public class Ant {
	   private static ArrayList<Ant> danhSachKien = new ArrayList<>();
	   
	   public Ant() {
	      //Tạo ra một con kiến mới và thêm vào danh sách
	      danhSachKien.add(this);
	   }
	   
	   public static int getSoLuongKien() {
	      return danhSachKien.size();
	}
	   public static void main(String[] args) {
	        // Tạo ra một số con kiến
	        Ant kien1 = new Ant();
	        Ant kien2 = new Ant();
	        Ant kien3 = new Ant();
	      
	        // In ra số lượng con kiến hiện có trong đàn
	        System.out.println("Số lượng kiến trong đàn là: " + Ant.getSoLuongKien()); // Số lượng kiến trong đàn là: 3
	      
	        // Tạo thêm một số con kiến
	        Ant kien4 = new Ant();
	        Ant kien5 = new Ant();
	      
	        // In ra số lượng con kiến hiện có trong đàn
	        System.out.println("Số lượng kiến trong đàn là: " + Ant.getSoLuongKien()); // Số lượng kiến trong đàn là: 5
	    }

}
