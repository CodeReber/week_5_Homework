package Week_5_HW;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		StringBuilder str2 = new StringBuilder();
		
		for (int i = 0; i < str2.length(); i++) {
			str2.append(str.charAt(i) + " ");
		}
		
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		System.out.println("Error: ");
		log(str);
		
	}

}
