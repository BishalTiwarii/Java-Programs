package customException;

public class CustomException {
private String currency;
private int amount;
public CustomException(String currency, int amount) {
	
	this.currency = currency;
	this.amount = amount;
}
public void addAmount(CustomException that) throws CurrenciesDoNotMatchException
{
	if (!this.currency.equals(that.currency)) {
		throw new CurrenciesDoNotMatchException("currency do not match exception");
		}
	else {
	this.amount=this.amount+that.amount;
	}
	}
	public String toString()
	{
	
	return currency+""+amount;
	
	}
}
