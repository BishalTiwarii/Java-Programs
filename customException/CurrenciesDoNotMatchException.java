package customException;

public class CurrenciesDoNotMatchException extends Exception {
	CurrenciesDoNotMatchException(String msg)
	{
		super(msg);
	}

}
