package gui.event;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;

public class ItemEventTest1Listener implements ItemListener {
	ItemEventTest1 mainView;
	int VALBOLD = Font.PLAIN;
	int VALITALIC = Font.PLAIN;
	public ItemEventTest1Listener(ItemEventTest1 mainView){
		super();
		this.mainView = mainView;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox check = (JCheckBox)e.getSource();
		System.out.println(check.getText());
		if(e.getSource() == mainView.bold){
			if(e.getStateChange()== ItemEvent.SELECTED){
				VALBOLD = Font.BOLD;
				
			}else {
				VALBOLD = Font.PLAIN;
						
			}
		}else if(e.getSource()==mainView.italic){
			if(e.getStateChange()== ItemEvent.SELECTED){
				VALITALIC = Font.ITALIC;
				
			}else {
				VALITALIC = Font.PLAIN;
						
			}
		}
		
		
		mainView.text.setFont(new Font("±¼¸²Ã¼",VALBOLD+VALITALIC,18));

	}

}
