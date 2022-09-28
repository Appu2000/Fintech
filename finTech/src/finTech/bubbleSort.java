package finTech;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {-5,45,0,9,-15};
		int temp;
		System.out.println("Step no: 1");
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
				for(int k=0;k<a.length;k++) {
					System.out.print(" "+a[k]);
				}
				System.out.println();
			}
			System.out.println("\nStep no:"+(i+2));
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(" "+a[k]);
		}
	}
}