
public class Jawaban10 {
	public static void main(String[] args) { 
		int [] x = new int [] {5,9,13,43,2,7};
		int temp = 0;
		for (int a = 0; a < x.length; a++) { 
			for (int b = a+1; b < x.length; b++) { 
				if(x[a] > x[b]) { 
					temp = x[a];
					x[a] = x[b];
					x[b] = temp; 
				}  
			}
		}
		System.out.println();
		System.out.println("Array sorted in the ascending order: ");
		for (int a = 0; a < x.length; a++) {
			System.out.print(x[a] + " ");
		}
	}
}
