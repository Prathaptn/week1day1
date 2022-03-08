package week1.day1;

// access specifier keyword ClassName
public class LearningVariables1 {
	String mobileModel = "Galaxy M31";
	int    mobileWeight = 300;
	boolean isFullCharge = true;
	double mobileCost = 15999.99;


//accessSpecfier  return type methodName

public void makeCall() {
	
	
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
	System.out.println(isFullCharge);
	System.out.println(mobileCost);
	mobileCost =15000;
	
	 
	
	
	
}
	public void sendMsg() {
		
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(isFullCharge);
		System.out.println(mobileCost);
		
		
		
	}
	// main -> cntrl + space ,enter
	public static void main(String[] args) {
	
		
		//ClassName objectName  new  ClassName
		LearningVariables1 mob = new LearningVariables1();
		
	   // use the object to call a method	
		mob.makeCall();
		mob.sendMsg();
		
		
		
		
	}

}


