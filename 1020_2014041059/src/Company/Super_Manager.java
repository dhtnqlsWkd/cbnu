package Company;
public class Super_Manager extends Employee {

	private String position;
	
	public Super_Manager(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.position = position;
	}
	
	public String addStr() {
		String result = super.resultStr();
		result += "��å : " + position + "\n";
		
		return result;
	}

}
