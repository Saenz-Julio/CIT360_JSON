package client;

import util.JsonUtil;
import model.EmployeeBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeBean employee = new EmployeeBean();
		employee.setFirstName("Tom");    // employee first name
		employee.setLastName("Smith");   // employee last name
		employee.setStartYear(2000);     // the year of starting employment
		employee.setPayRate(12);         // employee salary
		
		// Coverts Java Object to Json
		String jsonEmployeeBean = JsonUtil.converJavaToJson(employee);		
		System.out.println(jsonEmployeeBean);		
		System.out.println("========================");
		
		// converts from Json to Java Object
		EmployeeBean employee1 = JsonUtil.convertJsonToJava(jsonEmployeeBean, EmployeeBean.class);
		System.out.println(employee1.getFirstName() + " " + employee.getLastName() + " " + employee.getStartYear() + " " + employee.getPayRate());

	}

}
