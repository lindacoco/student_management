package student_management.dto;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import student_management.ui.Student;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class DepartmentPanel extends JPanel {
	private JLabel lblDeptNo;
	private JTextField tfDeptNo;
	private JLabel lblDeptName;
	private JTextField textField;
	private JLabel lblFloor;
	private JTextField textField_1;

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
		
		textField = new JTextField();
		textField.setColumns(10);
		add(textField);
		
		lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		add(textField_1);
	}
	public Department getDepartment() {
		String a= tfDeptNo.getText().trim();
		int b= Integer.parseInt(lblDeptName.getText().trim());
		int c= Integer.parseInt(lblFloor.getText().trim());
		Department department = new Department(a,b,c);
		return department;
	}
	private void clearTf() {
		tfDeptNo.setText("");
		lblDeptName.setText("");
		lblFloor.setText("");
	}
	
	private void setStudent(Student std) {
		tfDeptNo.setText(std.getStdNo()+"");
		lblDeptName.setText(new String(std.getStdName()+""));
		lblFloor.setText(std.getKor()+"");
	}
	
}
