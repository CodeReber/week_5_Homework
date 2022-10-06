package Week_5_HW;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println("***" + str + "***");
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		System.out.println("***Error: " + str + "***");
	}
	
	

}
