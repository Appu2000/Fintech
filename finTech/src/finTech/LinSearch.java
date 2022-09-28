package finTech;

public class LinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,6,7,8,9};
		int key=5;
		int flag=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println("element found in: "+i);
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("element not found");
		}
	}

}
