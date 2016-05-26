package gui.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;

public class ItemEventTest2Listener implements ItemListener {
	ItemEventTest2 mainView;
	
	public ItemEventTest2Listener(ItemEventTest2 mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton)e.getSource();
		if(e.getStateChange()==ItemEvent.SELECTED){
			mainView.tex.setText(radio.getText());
		}else{
			mainView.tex.setText("");
		}

	}

}
