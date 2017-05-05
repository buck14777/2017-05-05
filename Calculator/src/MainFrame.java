import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainFrame extends Frame{
	private Label lab = new Label("0");
	private Font font1 = new Font(null,Font.PLAIN,46);
	private Button btns[] = new Button[16];
	private Panel pnl = new Panel(new GridLayout(4,4,5,5));
	private String btnLabels[] = {"7","8","9","/",
			"4","5","6","*",
			"1","2","3","-",
			"0",".","=","+"};
	public   MainFrame(){
		initComp();
	}
	private  void initComp(){
		this.setBounds(100, 100, 350, 420);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		this.setLayout(new BorderLayout(5,10));
		lab.setBackground(Color.PINK);
		lab.setFont(font1);
		lab.setAlignment(Label.RIGHT);
		this.add(lab, BorderLayout.NORTH);
		for(int i = 0;i<16;i++){
			btns[i] = new Button();
			btns[i].setLabel(btnLabels[i]);
			btns[i].setFont(font1);
			pnl.add(btns[i]);
		}
		
		this.add(pnl, BorderLayout.CENTER);
		
	}
	}
