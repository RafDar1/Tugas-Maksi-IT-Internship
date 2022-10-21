
class Jawaban4 {
	static String checkPosNeg(int x)
	{
		if (x > 0)
			return "positive";
		else if (x < 0)
			return "negative";
		else
			return "zero";
		}
	public static void main(String[] args)
	{
		int firstNumber = 5;
        System.out.println(firstNumber + " is a "
                           + checkPosNeg(firstNumber) + " number");
    }
}