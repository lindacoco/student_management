package student_management.ui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import student_management.dto.Title;
import student_management.ui.pannel.AbsItemPanel;
import student_management.ui.pannel.DepartmentPanel;
import student_management.ui.pannel.TitlePanel;

@SuppressWarnings("serial")
public class TitleManagementFrame extends AbsManagementFrame<Title>{
	private TitlePanel titlePanel;
	
	
	@Override
	protected AbsItemPanel<Title> createItemPanel() {
		titlePanel = new TitlePanel();
		return titlePanel;
	}

	@Override
	protected Title getItem() {
		return titlePanel.getItem();
	}
	
}
