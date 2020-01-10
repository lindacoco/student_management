package student_management.ui.frame;

import student_management.dto.Department;
import student_management.ui.pannel.AbsItemPanel;
import student_management.ui.pannel.DepartmentPanel;

@SuppressWarnings("serial")
public class DepartmentManagementFrame extends AbsManagementFrame<Department> {
	private DepartmentPanel deptPanel;
	
	public DepartmentManagementFrame() {
		
	}

	@Override
	protected AbsItemPanel<Department> createItemPanel() {
		deptPanel = new DepartmentPanel();
		return deptPanel;
	}

	@Override
	protected Department getItem() {
		return deptPanel.getItem();
	}
	
}
