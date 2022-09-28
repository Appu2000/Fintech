package finTech;

public class InserSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={3,7,10,4,6,2};
		int temp,j=0;
		for(int i=1;i<a.length;i++) {
			temp=a[i];
			j=i-1;
		//belowcheck elem pos in ordered list
				while(j>=0 && a[j]>=temp) {
					a[j+1]=a[j];
					j--;		
				}
			a[j+1]=temp;
		}
		
		for(int k=0;k<a.length;k++) {
			System.out.print(""+a[k]+" ");
		}
	}
	
	
	

}
