package FlowLayoutTest;

import java.awt.*;

public class FlowLayoutTest extends Frame {

	FlowLayout f = new FlowLayout();
	Button btn[] = new Button[10];
	
	public FlowLayoutTest(String str) {
		super(str);
		setLayout(f);
		
		for (int i = 0; i < 10; i++) {
			btn[i] = new Button((i + 1) + "¹ø ¹öÆ°");
			add(btn[i]);
		}
		
		setBounds(100, 100, 200, 200);
		setVisible(true);
	}
}
