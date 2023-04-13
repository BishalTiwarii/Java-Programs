package switchProgram;

public class Switch {

	public static void main(String[] args) {
	  int number=1000;
		switch (number) {
	case 1000:System.out.println("the key matches with 1000");
		
		break;
	case 2000:System.out.println("the key matches with 2000");
	break;
	case 3000:System.out.println("the key matches with 3000");
	

	default:System.out.println("the key doesn't matches with anyof the case");
		break;
	}
		
		String str="ipdigital";
		
		switch (str) {
		case "microstrategy":System.out.println("the key matches with microstrategy");
			
			break;
		case "ipdigital":System.out.println("the key matches with ipdigital");
		break;

		default:System.out.println("the key doesn't mataches with any cases");
			break;
		}
		
		byte by=90;
		switch (by) {
	case 10:System.out.println("the key matches with 10");
		
		break;
	case 20:System.out.println("the key matches with 20");
	break;
	case 30:System.out.println("the key matches with 30");
	
	default:System.out.println("the key doesn't matches with any case");
	

	}

}}
