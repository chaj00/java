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
		System.out.println("전제 아이템수=>"+mainView.subject.getItemCount());
		System.out.println("전제 아이템수=>"+combo.getItemCount());
		System.out.println("선택된 아이템의 인덱스=>"+combo.getSelectedIndex());
		System.out.println("선택된 아이템=>"+combo.getSelectedItem());
		
		mainView.text1.setText(combo.getSelectedItem()+"");
	}

}
