package finTech;
//not completed
public class QuickSort {
	
	
	
	void display(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	int partition(int a[],int low,int high) {
		
		int pivot=a[high];
		int l=(low-1);
		int temp;
		
		for(int j=low;j<=(high-1);j++) {
	//	System.out.println("inside partition "+low+" "+high+" "+pivot);
			if(a[j]<pivot) {
				l++;
				
			    temp=a[l];
			    a[l]=a[j];
			    a[j]=temp;
			}
		}
		
		temp=a[l+1];
		a[l+1]=a[high];
		a[high]=temp;
		return (l+1);
	}
	
	int[] quick(int a[],int low ,int high) {
		if(low<high) {
			//System.out.println("inside quick "+low+" "+high+" ");
			int pi=partition(a,low,high);
			quick(a,low,pi-1);
			quick(a,pi+1,high);
		}
		return a;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,1,3,5,2,6,4};
		QuickSort Q=new QuickSort();
		Q.display(a);
		System.out.println();
		int b[]= Q.quick(a, 0, a.length-1);
		Q.display(a);
	

	}

}
