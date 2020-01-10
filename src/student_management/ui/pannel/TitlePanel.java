package student_management.ui.pannel;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import student_management.dto.Department;
import student_management.dto.Student;
import student_management.dto.Title;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class TitlePanel extends AbsItemPanel<Title> {
	private JLabel lblTitleNo;
	private JTextField titleNo;
	private JLabel lblDeptName;
	private JTextField titleName;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uD559\uACFC\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		lblTitleNo = new JLabel("직책명");
		lblTitleNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTitleNo);
		
		titleNo = new JTextField();
		add(titleNo);
		titleNo.setColumns(10);
		
		lblDeptName = new JLabel("학과명");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		titleName = new JTextField();
		titleName.setColumns(10);
		add(titleName);
	}

	public void clearTf() {
		titleNo.setText("");
		titleName.setText("");
	
	}
	
	
	@Override
	public void setItem(Title dept) {
		titleNo.setText(dept.getTitleNo()+"");
		titleName.setText(new String(dept.getTitleName()+""));
	
	}
	@Override
	public Title getItem() {
		int a= Integer.parseInt(titleNo.getText().trim());
		String b= titleName.getText().trim();
		Title tt = new Title(a,b);
		return tt;
	}
	
}
