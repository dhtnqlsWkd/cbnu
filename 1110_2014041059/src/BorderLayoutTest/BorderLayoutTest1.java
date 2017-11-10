package BorderLayoutTest;

import java.awt.*;

public class BorderLayoutTest1 extends Frame {

	public BorderLayoutTest1(String str) {
		super(str);
		setLayout(new BorderLayout());
		
		add("North", new Button("����"));
		add("West", new Button("����"));
		add("East", new Button("����"));
		add("Center", new Button("�߾�"));
		add("south", new Button("����"));
		
		setSize(200, 200);
		setVisible(true);
	}
}
