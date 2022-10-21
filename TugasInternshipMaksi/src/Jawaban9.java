
public class Jawaban9 {
	static int arr[] = {5,9,13,43,2,7};
    static int sum() {
    	int sum = 0;
        int a;
        for (a = 0; a < arr.length; a++)
        	sum += arr[a];
        return sum;
    }
    public static void main(String[] args) {
    	System.out.println("Total sum of the array: " + sum());
    }
}