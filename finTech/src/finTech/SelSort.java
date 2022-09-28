package finTech;

public class SelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,4,7,3};
	
		int l=a.length,temp;
		int min;
		int index=0;
		for (int i=0;i<a.length;i++) {
			min=a[i];
			for (int j=i;j<a.length;j++) {
				if(a[j]<=a[i]) {
					min=a[j];
				    index=j;
				}
			  
			}
	
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;

		
	}
		for(int k=0;k<a.length;k++) {
			System.out.print(" "+a[k]);
		}
	}
}
