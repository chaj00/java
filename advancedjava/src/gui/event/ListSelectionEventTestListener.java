package gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListSelectionEventTestListener implements ActionListener, ListSelectionListener {
	ListSelectionEventTest mainView;
	boolean state = true;
	
	public ListSelectionEventTestListener(ListSelectionEventTest mainView) {
		super();
		this.mainView = mainView;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(state){
			System.out.println(mainView.movie.getSelectedIndex()+":"+mainView.movie.getSelectedValue());
			mainView.text2.setText(mainView.movie.getSelectedValue()+"");
		}
		state = !state;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox combo = (JComboBox)e.getSource();
		System.out.println("���� �����ۼ�=>"+mainView.subject.getItemCount());
		System.out.println("���� �����ۼ�=>"+combo.getItemCount());
		System.out.println("���õ� �������� �ε���=>"+combo.getSelectedIndex());
		System.out.println("���õ� ������=>"+combo.getSelectedItem());
		
		mainView.text1.setText(combo.getSelectedItem()+"");
	}

}
