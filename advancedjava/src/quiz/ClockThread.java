package quiz;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class ClockThread extends Thread{
	OnlineQuiz mainView;

	public ClockThread(OnlineQuiz mainView) {
		super();
		this.mainView = mainView;
	}
	
	@Override
	public void run() {
		int sec=0;
		int msec=0;
		int bar=0;
		mainView.lbltime.setText(Integer.toString(sec)+":"+msec);
		try {
			while(!Thread.currentThread().isInterrupted()){
				Thread.sleep(100);
				msec++;
				bar++;
				if(msec==10){
					sec++;
					msec=0;
				}
				mainView.lbltime.setText(Integer.toString(sec)+":"+Integer.toString(msec));
				mainView.jProgressBar1.setValue(bar);
				
				if(sec==10){
					interrupt();
				}
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		} finally{
			System.out.println("쓰레드 종료");
		}
	}
}
