package DemoGradle;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {3,0,1,0,5,0,0,7,0};
//		[3,1,5,7,0,0,0,0,0]
//		[3,1,0,5,0,0,7,0,0]
//		[3,1,5,7]
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				for(int j=i;j<array.length-1;j++) {
					array[i]=array[i+1];
					
				}
				array[array.length-1]=array[i];
				
			}
		}
		
		for(int i=0;i<array.length;i++) {
		System.out.print(array[i]);
		}

	}

}
