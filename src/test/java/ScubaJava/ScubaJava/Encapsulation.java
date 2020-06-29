package ScubaJava.ScubaJava;

class Employee {
	
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	private String employee;
	private int empID;
	private String companyName;
}
	public class Encapsulation {
	public static void main(String[] args) {
	       
        Employee emp=new Employee();
        emp.setCompanyName("Rutukanta");
        emp.setEmpID(3789);
        emp.setCompanyName("Maveric");
       
        System.out.println("The employee name is " +emp.getCompanyName() +" And ID is "+emp.getEmpID()+ " And Company Name is " +emp.getCompanyName());
       
   }
}
