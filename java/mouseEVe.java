import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class mouseEVe extends Frame implements MouseMotionListener {

	static JLabel label1, label2;
	mouseEVe()
	{
	}

	public static void main(String[] args)
	{
		JFrame f = new JFrame("MouseMotionListener");

		
		f.setSize(600, 400);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		p.setLayout(new FlowLayout());

		label1 = new JLabel("no event ");

		label2 = new JLabel("no event ");

		// create an object of mouse class
		mouseEVe m = new mouseEVe();

		f.addMouseMotionListener(m);

		p.add(label1);
		p.add(label2);

		f.add(p);

		f.show();
	}
	public void mouseDragged(MouseEvent e)
	{
		label1.setText("mouse is dragged through point "
					+ e.getX() + " " + e.getY());
	}

	public void mouseMoved(MouseEvent e)
	{
		label2.setText("mouse is moved to point "
					+ e.getX() + " " + e.getY());
	}
}
