
class Company_Employee {
	private String empNo;
	private String name;
	private String part;
	
	public Company_Employee() {
	}
	public Company_Employee(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	public String resultStr() {
		String result = "";
		
		result += "사번 : " + empNo + "\n";
		result += "이름 : " + name + "\n";
		result += "부서 : " + part + "\n";
		
		return result;
	}
}
