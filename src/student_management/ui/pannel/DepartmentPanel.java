package student_management.ui.pannel;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import student_management.dto.Department;
import student_management.dto.Student;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class DepartmentPanel extends JPanel {
	private JLabel lblDeptNo;
	private JTextField tfDeptNo;
	private JLabel lblDeptName;
	private JTextField tfDeptName;
	private JLabel lblFloor;
	private JTextField tfFloor;

	/**
	 * Create the panel.
	 */
	public DepartmentPanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uD559\uACFC\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		lblDeptNo = new JLabel("학과번호");
		lblDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptNo);
		
		tfDeptNo = new JTextField();
		add(tfDeptNo);
		tfDeptNo.setColumns(10);
		
		lblDeptName = new JLabel("학과명");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		tfDeptName = new JTextField();
		tfDeptName.setColumns(10);
		add(tfDeptName);
		
		lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		tfFloor = new JTextField();
		tfFloor.setColumns(10);
		add(tfFloor);
	}
	public Department getItem() {
		
		int a= Integer.parseInt(tfDeptNo.getText().trim());
		String b= tfDeptName.getText().trim();
		int c= Integer.parseInt(tfFloor.getText().trim());
		Department department = new Department(a,b,c);
		return department;
	}
	public void clearTf() {
		tfDeptNo.setText("");
		tfDeptName.setText("");
		tfFloor.setText("");
	}
	
	private void setItem(Department dept) {
		tfDeptNo.setText(dept.getDeptNo()+"");
		tfDeptName.setText(new String(dept.getDeptName()+""));
		tfFloor.setText(dept.getFloor()+"");
	}
	
}
