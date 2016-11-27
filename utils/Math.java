package utils;

public class Math{

	public static int fact(int number){
		if (number == 0)
			return 1;

		return number * Math.fact(number - 1);
	}
	public static long factorialLoop(int number){
		int sum = 1;

		for(int i = number; i > 0; i--)
			sum *= i;

		return sum;
	}
}