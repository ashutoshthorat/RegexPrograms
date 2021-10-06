package DemoGradle;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StockDetails {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter item number");
		int itemnumber=scan.nextInt();
		System.out.println("enter stock value");
		int stock=scan.nextInt();
		LocalDateTime localdate=LocalDateTime.now();
		
		int[] itemdetails= {101,102,103,104};
		int[] stockdetails= {45,34,23,56,96};
		int[] itemprice= {100,200,300,400,500};
		for(int i=0;i<itemdetails.length;i++) {
			if(itemnumber==itemdetails[i]) {
				int stockcount=stockdetails[i]-stock;
				if(stockdetails[i]<=stock || stockcount<0) {
					System.out.println("NO STOCK  -> TOTAL PRICE");
					System.out.println(stockdetails[i]+"->update stock");
				}else {
					int price=itemprice[i]*stock;
					stockdetails[i]=stockcount;
					System.out.println(price+"-->price");
					System.out.println(stockcount+"LEFT-->stock update");
				}
				
				
			}
		}
	
	}

}
