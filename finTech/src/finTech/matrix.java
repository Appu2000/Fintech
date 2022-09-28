package finTech;

public class matrix {
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int c[][]= {{0,0,0},{0,0,0},{0,0,0}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		
		for(int k=0;k<c.length;k++) {
			for(int l=0;l<c.length;l++) {
				System.out.print(" "+c[k][l]);
			}
			System.out.println();
			
		}
	}

}
