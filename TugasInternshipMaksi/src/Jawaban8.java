
public class Jawaban8{
	public static int lowest(int[] x, int total) {
		int temp;
		for (int a = 0; a < total; a++){
			for (int b = a + 1; b < total; b++) {
				if (x[a] > x[b]) {
					temp = x[a];
					x[a] = x[b];
					x[b] = temp;
				}
			}
		}
		return x[0];
	}
    public static void main(String args[]) {
    int a[]={5,9,13,43,2,7};
    System.out.println("Smallest: " +lowest(a,6));
    }
}