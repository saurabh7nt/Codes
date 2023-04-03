class MatrixCountZero{
	public static void main(String[] args){
		int [][] arr = {
					{1,2,0},
					{0,0,0}
					};
		int i,j, count=0;
		for(i=0; i<2; i++){
			for(j=0; j<3; j++){
				if(arr[i][j] == 0){
					count++;
				}
			}
		}
		System.out.println("Frequency of zero : "+count);
	}
}