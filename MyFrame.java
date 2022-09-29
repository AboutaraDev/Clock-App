import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	JLabel clockLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	Calendar timeCalendar;
	SimpleDateFormat clockFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	String clock;
	String day;
	String date;
	
	MyFrame() {
		
		this.setTitle("Clock App");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 250);
		this.setLayout(new FlowLayout());
		
		clockLabel = new JLabel();
		clockLabel	.setFont(new Font("Verdana", Font.PLAIN, 50));
		clockLabel.setForeground(new Color(0x00FF00));
		clockLabel.setBackground(Color.black);
		clockLabel.setOpaque(true);
		
		clockFormat = new SimpleDateFormat("HH:mm:ss a");
        clock = clockFormat.format((Calendar.getInstance().getTime()));
        clockLabel.setText(clock);
        
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		
		dayFormat = new SimpleDateFormat("EEEE");
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
        
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
        
        dateFormat = new SimpleDateFormat(" dd/MM/yyyy");
        date = dateFormat.format((Calendar.getInstance().getTime()));
        dateLabel.setText(date);
        		
        this.add(clockLabel);
        this.add(dayLabel);
        this.add(dateLabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
	 
	  while(true) {
		  clock =	clockFormat.format(Calendar.getInstance().getTime());
	      clockLabel.setText(clock);
	      
	      day = dayFormat.format(Calendar.getInstance().getTime());
	      dayLabel.setText(day);
	      
	      date = dateFormat.format(Calendar.getInstance().getTime());
	      dateLabel.setText(date);
	  }
	  
	}

}
