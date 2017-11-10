package ListTest;

import java.awt.*;

public class ListTest extends Frame {

	Panel p;
	List list;
	public ListTest(String str) {
		super(str);
		p = new Panel();
		
		list = new List(2, true);
		list.add("이대");
		list.add("강남");
		list.add("구로");
		list.add("종로");
		
		p.add(list);
		add(p);
		
		setSize(300, 100);
		setVisible(true);
	}
}
