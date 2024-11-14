package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import composite.SremBanatBacka;

public class DrawingController {
	
	private DrawingModel model;
	private DrawingFrame frame;
	
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	public void mouseClicked(MouseEvent e) {
		/* MVC materijal 
		Point p = new Point(e.getX(), e.getY(), Color.BLUE);
		model.add(p);
		frame.repaint(); */
		
		// Composite materijal
		SremBanatBacka vojvodina = new SremBanatBacka();
		
		Point srem = new Point(e.getX(), e.getY()-20, Color.BLUE);
		Point backa = new Point(e.getX()+10, e.getY(), Color.BLUE);
		Point banat = new Point(e.getX()-10, e.getY(), Color.BLUE);
		
		vojvodina.add(srem);
		vojvodina.add(backa);
		vojvodina.add(banat);
		
		model.add(vojvodina);
		
		frame.repaint();
	}
	

}
