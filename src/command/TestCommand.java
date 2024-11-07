package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		
		DrawingModel model = new DrawingModel();
		
		System.out.println("1. Broj oblika u listi: " + model.getShapes().size());  // ---> 0

		Point point = new Point(10, 10, Color.BLACK);
		
		// ---- Testiranje dodavanja
		// model.add(point);   ---> ne radimo jer posle nemamo komandu za undo i redo
		AddPointCmd addPointCmd = new AddPointCmd(point, model);
		addPointCmd.execute();
		System.out.println("2. Broj oblika u listi: " + model.getShapes().size()); // ---> 1
		addPointCmd.unexecute();
		System.out.println("3. Broj oblika u listi: " + model.getShapes().size()); // ---> 0
		addPointCmd.execute();
		
		// ---- Testiranje brisanja
		Command removePointCmd = new RemovePointCmd(model, point);
		removePointCmd.execute();
		System.out.println("4. Broj oblika u listi: " + model.getShapes().size()); // ---> 0
		removePointCmd.unexecute();
		System.out.println("5. Broj oblika u listi: " + model.getShapes().size()); // ---> 1
	
		
		// ---- Testiranje modifikacije
		Point point2 = new Point(20, 20, Color.BLACK);
		Command updatePointCmd = new UpdatePointCmd(point, point2);
		updatePointCmd.execute();
		//point = point2;
		System.out.println(point);
		updatePointCmd.unexecute();
		System.out.println(point);
		
		
	}
}
