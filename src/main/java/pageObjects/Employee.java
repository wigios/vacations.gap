package pageObjects;

import commons.ExcelUtils;

public class Employee {

	private String user;
	private String pass;
	private String firstName;
	private String lastName;
	private String email;
	private String id;
	private String leaderName;
	private String yearBirth;
	private String monthBirth;
	private String dayBirth;

	public Employee() {

		try {
			ExcelUtils.setExcelFile("DataTestPractice.xlsx", "Hoja1");

			this.user = ExcelUtils.getCellData(1, 0);
			this.pass = ExcelUtils.getCellData(1, 1);
			this.firstName = ExcelUtils.getCellData(1, 2);
			this.lastName = ExcelUtils.getCellData(1, 3);
			this.email = ExcelUtils.getCellData(1, 4);
			this.id = ExcelUtils.getCellData(1, 5);
			this.leaderName = ExcelUtils.getCellData(1, 6);
			this.yearBirth = ExcelUtils.getCellData(1, 7);
			this.monthBirth = ExcelUtils.getCellData(1, 8);
			this.dayBirth = ExcelUtils.getCellData(1, 9);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(String yearBirth) {
		this.yearBirth = yearBirth;
	}

	public String getMonthBirth() {
		return monthBirth;
	}

	public void setMonthBirth(String monthBirth) {
		this.monthBirth = monthBirth;
	}

	public String getDayBirth() {
		return dayBirth;
	}

	public void setDayBirth(String dayBirth) {
		this.dayBirth = dayBirth;
	}
	
	

}
