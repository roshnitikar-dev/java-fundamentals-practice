package com.company.CompanyDirectory;
import com.company.employee.EmployeeInfo;
import com.company.department.DepartmentInfo;
public class Directory {
	public static void main(String[] args) {
  EmployeeInfo e1= new EmployeeInfo();
  DepartmentInfo d1= new DepartmentInfo();
  String n1= e1.name("Avni");
 String n2= d1.name("Logistics");
 System.out.println("Name of the empolyee: " +n1  +"  Department: "+n2);
 

}
}
