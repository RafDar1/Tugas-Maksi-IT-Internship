import java.util.Scanner;
	class Jawaban7{
		String str;
		void accept(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Word to make it Descending: ");
			str =scan.nextLine();
		}
		void print(){
			int i;
            str = str.toUpperCase();
            for(i=0; i<str.length(); i++){
            	System.out.println("\t"+str.charAt(i));
            }
		}
		public static void main(String[] args)
        {
        	Jawaban7 string = new Jawaban7();
        	string.accept();
        	string.print();
        }
	}  
