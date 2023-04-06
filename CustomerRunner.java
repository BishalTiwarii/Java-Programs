package bishal;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress=new Address("btm 2nd stage ","bangalore", "560076");
		Customer customer=new Customer("bishal", homeAddress);
        Address workAddress=new Address("jp nagar", "Bangalore", "560078");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
		Address homeAddress1=new Address("charminar","Hyderbaad","800098");
		Customer customer1=new Customer("neel",homeAddress1);
		Address workAddress1=new Address("hsr layout", "bangalore", "560075");
		customer1.setWorkAddress(workAddress1);
		System.out.println(customer1);

	}

}
