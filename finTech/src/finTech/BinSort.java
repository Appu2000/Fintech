package finTech;
// its binary search
public class BinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,6,7,8,9};
		int key=7;
		int end=a.length;
		int start=0;
		int mid,flag=0;
		
		
        while(start<=end) {
        	mid=(start+end)/2;
        	if(a[mid]==key) {
        		System.out.println("element found in"+mid);
        		flag=1;
        		break;
        	}
        	if(a[mid]>key) {
        		
        		end=mid-1;
        		
        		
        	}
        	if(a[mid]<key) {
        		
        		start=mid+1;
        		
        	}
        }
        if(flag==0) {
        	System.out.println("element not found");
        }
	}

}
