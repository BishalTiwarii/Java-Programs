package enumPackage;

enum Climate
{
	      COLD(18),HOT(35),RAINY(24),HUMIDITY(28); //cordinal specify the way you declared it 
	   // 0        1         2         3
	private int value;
	
	private Climate(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}



public class EnumExample5 {
	
	public static void main(String[] args)
	{
	 Climate climate=Climate.COLD;
	 
	 //printing the cordinal of the enum
	  System.out.println("------------printing enums cordinal--------------");
		
    System.out.println("The codinal of COLD is = "+climate.COLD.ordinal());
    System.out.println("The codinal of RAINY is = "+climate.RAINY.ordinal());
    System.out.println("The codinal of HOT is = "+climate.HOT.ordinal());
    System.out.println("The codinal of HUMIDITY is = "+climate.HUMIDITY.ordinal());
    
    //Printing the value of enums 
    System.out.println("------------printing enums value--------------");
    
    System.out.println("Today's cold temparature is= "+climate.getValue()+"*celsius");
    System.out.println("Today's humidity is= "+climate.HUMIDITY.getValue()+"*celsius");
    System.out.println("Today's it is raining and the tempatature is = "+climate.RAINY.getValue()+"*celsius");
    System.out.println("Today's it is sunny and the temperature is = "+climate.HOT.getValue()+"*celsius");
    
    
   
    
	}
}
