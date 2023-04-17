package customException;

public class CustomExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		CustomException amount1=new CustomException("INR",100);
		CustomException amount2=new CustomException("USD",50);
		
		amount1.addAmount(amount2);
		System.out.println(amount1);

	}

}
