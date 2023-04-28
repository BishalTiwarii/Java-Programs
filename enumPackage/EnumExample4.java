package enumPackage;

class EnumExample4{  
	
enum Season { WINTER, SPRING, SUMMER, FALL; }  //semicolumn(;) is optional here 

public static void main(String[] args) 
{  

//enum type is required to access WINTER  
	
Season s=Season.WINTER;

System.out.println(s);  

}
}  