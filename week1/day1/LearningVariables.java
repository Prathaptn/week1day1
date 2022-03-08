package week1.day1;

public class LearningVariables {
	
	String mobileModel = "Galaxy M31";
	int    mobileWeight = 300;
	boolean isFullCharge = true;
	double mobileCost = 15999.99;
	
	public static void main(String[] args) {
		
		LearningVariables mob = new LearningVariables();
		
		System.out.println(mob.mobileModel);
		System.out.println(mob.mobileWeight);
		System.out.println(mob.isFullCharge);
		System.out.println(mob.mobileCost);
	}

}
