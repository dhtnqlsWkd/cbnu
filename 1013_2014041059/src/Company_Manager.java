
class Company_Manager extends Company_Employee{
	private String position;
	
	public Company_Manager(String empNo, String name, String part, String position) {
		setEmpNo(empNo);
		setName(name);
		setPart(part);
		this.position = position;
	}
	
	public String addStr() {
		String result = "";
		result = "Á÷Ã¥ : " + position + "\n";
		
		return result;
	}
}
