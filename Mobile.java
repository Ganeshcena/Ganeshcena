package week1.day1;

public class Mobile 
{
 String mobileModel = "samsung";
 int mobileWeight = 150;
 boolean isFullCharge = true;
 short mobileCost = 30000;
 
	public void makeCall() 
 {
	System.out.println("makeCall");
}
	public void sendSms() 
	{
	 System.out.println("sendSms");
}
	
 public static void main(String[] args) 
 {
	Mobile mob = new Mobile();
	mob.makeCall();
	mob.sendSms();
	System.out.println(mob.mobileModel);
	System.out.println(mob.mobileWeight);
	System.out.println(mob.isFullCharge);
	System.out.println(mob.mobileCost);
}
 
}
