class MatrixEquality{
	public static void main(String[]args){
		int[][] arr = {
                    {1,2,3},
                    {4,5,6}	
					};
		int[][] brr = {
					{1,2,3},
					{5}	
					};
		int i,j;
		boolean flag = false;
            for(i=0; i<2; i++){
                for(j=0; j<3; j++){
                    if(arr[i][j] != brr[i][j]){
                        flag = true;
                        break;
                    }
                }
            }
		if(flag == true)
			System.out.println("UnEqual matrix");
		else
			System.out.println("Equal matrix");
	}
}