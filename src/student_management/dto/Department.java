package student_management.dto;

public class Department {
	private String deptName;
	private int deptNo;
	private int floor;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptNo, String deptName, int floor) {
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.floor = floor;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("Department [deptName=%s, deptNo=%s, floor=%s]", deptName, deptNo, floor);
	}
   
}
