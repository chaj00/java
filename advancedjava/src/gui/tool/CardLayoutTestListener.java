package gui.tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTestListener implements ActionListener {
	CardLayoutTest mainView;
	
	public CardLayoutTestListener(CardLayoutTest mainView) {
		super();
		this.mainView = mainView;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mainView.btnnext){
			mainView.card.next(mainView.p2);
		}else if(e.getSource()==mainView.btnpre){
			mainView.card.previous(mainView.p2);
		}
		
	}
	
}
