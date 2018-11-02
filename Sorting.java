package exam;

public class Sorting {

	public void ExamSort (int [] a, int size){
	
		int temp;
		int mid = size/2;
		
		for (int i = 0; i < mid; i++){
			if (a[i] > a[i + 1]){
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
	
		
		for (int j = mid  + 1; j < size; j ++)
			if (a[j] > a[j + 1]){
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	
	public void merge(){
		int [] arr = new int [0];
		
		ExamSort(arr, arr.length);
		
	}
	
	public static void main (String [] args){
		Sorting x = new Sorting ();
		int [] a = {15, 9, 60, 44, 12, 1, 4};
		x.ExamSort(a, 7);
	}
	
	
}