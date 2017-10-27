package model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/*JavaBeans is a regular java class.  It is not a specific object or program.
 * It must meet the following rules:
 * 1 - All properties set to private
 * 2 - Getters and setters methods (mutator methods)
 * 3 - Must have a public no argument constructor
 * 4 - Implement Serializable interface
*/

// properties can be ordered and can also be ignored if any of the properties are excluded
@JsonPropertyOrder(value = {
		"firstName",
		"lastName",
		"startYear",
		"payRate"
})
public class EmployeeBean implements Serializable {
	
	private String firstName;  // employee first name
	private String lastName;   // employee last name
	@JsonIgnore // this excludes the property startYear
	private int startYear;     // the year of starting employment
	private double payRate;    // the hourly pay rate
	
	public EmployeeBean() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param startYear
	 * @param payRate
	 */
	public EmployeeBean(String firstName, String lastName, int startYear, double payRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.startYear = startYear;
		this.payRate = payRate;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the startYear
	 */
	public int getStartYear() {
		return startYear;
	}

	/**
	 * @param startYear the startYear to set
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
		
}
