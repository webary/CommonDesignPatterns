public class Client {
	public static void main(String args[]) {
		try {
			DBFactory factory = (DBFactory) XMLUtil.getBean();
			Connection connect1 = factory.createConnection();
			Statement state1 = factory.createStatement();
			
			connect1.connect();
			state1.state("operation1");
			state1.state("operation2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
