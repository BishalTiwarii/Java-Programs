package customException;

public class CurrenciesDoNotMatchException extends RuntimeException {
	CurrenciesDoNotMatchException(String msg)
	{
		super(msg);
	}

}
