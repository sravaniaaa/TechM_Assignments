package tasks;
public class task6 {
    private int empId;
    private String empName;
    private double sal;
    private int experience;
 public void setEmployeeDetails(int empId,String empName,double sal,int experience)
 {
 	this.empId=empId;
 	this.empName=empName;
 	this.sal=sal;
 	this.experience=experience;
 }
 public void getEmployeeDetails()
 {
 	System.out.println("empid:"+empId+"\nempname:"+empName+"\nsalary:"+sal+"\nexperience"+experience);
 }
 public String getLoanEligibility()
 {
 	if(experience>5)
 	{
 		double annualsal=sal*12;
 		if(annualsal==600000.0)
 			return "2 lakhs of loan is granted";
 		else if(annualsal>=1000000.0 && annualsal<1500000.0)
 			return "5 lakhs of loan is granted";
 		else if(annualsal>=1500000.0)
 			return "7 lakhs of loan is granted";
 		else
 	    	return "loan is not granted because eligibilty is not matched";
 	}
 	else
 	return "loan is not granted because eligibilty is not matched";
 }
 public static void main(String x[])
 {
 task6 emp=new task6();
 emp.setEmployeeDetails(1, "rama", 100000, 6);
 emp.getEmployeeDetails();
 System.out.println(emp.getLoanEligibility());
 }
}

