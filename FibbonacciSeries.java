package week1.day1;

public class FibbonacciSeries {
	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secondNum=1;
		int sum=0;
		System.out.println(firstNum);
		for(firstNum = 1; firstNum <= range; firstNum++) {
			
		    firstNum=secondNum;
			secondNum=sum;	
			sum=firstNum+secondNum;
			
			System.out.println(sum);
		}
		
	}

}
