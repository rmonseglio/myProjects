package calculator.richard.monseglio;

import javafx.application.Application;


import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class CalculatorDriver extends Application{
	private TextField tfInputValueOfA = new TextField();
	private TextField tfInputValueOfB = new TextField();
	private TextField tfInputValueOfC = new TextField();
	private Button button = new Button("Calculate");
	private TextField tfOutputX1 = new TextField();
	private TextField tfOutputX2 = new TextField();
	
	
@Override
public void start(Stage primaryStage) {
	//Creating the GUI 
	GridPane gridPane = new GridPane();
	gridPane.setHgap(5);
	gridPane.setVgap(5);
	gridPane.add(new Label("Enter the value of A"), 0, 0);
	gridPane.add(tfInputValueOfA, 1, 0);
	gridPane.add(new Label("Enter the value of B"), 0, 1);
	gridPane.add(tfInputValueOfB, 1, 1);
	gridPane.add(new Label("Enter the value of C"), 0, 2);
	gridPane.add(tfInputValueOfC, 1, 2);
	gridPane.add(new Label("Calculate"), 0, 3);
	gridPane.add(button, 1, 3);
	gridPane.add(new Label("Value of X1"), 0, 4);
	gridPane.add(tfOutputX1, 1, 4);
	gridPane.add(new Label("Value of X2"), 0, 5);
	gridPane.add(tfOutputX2, 1, 5);
	// Setting properties for GUI
	gridPane.setAlignment(Pos.CENTER);
	tfInputValueOfA.setAlignment(Pos.BASELINE_RIGHT);
	tfInputValueOfB.setAlignment(Pos.BASELINE_RIGHT);
	tfInputValueOfC.setAlignment(Pos.BASELINE_RIGHT);
	GridPane.setHalignment(button, HPos.RIGHT);
	tfOutputX1.setAlignment(Pos.BOTTOM_LEFT);
	tfOutputX2.setAlignment(Pos.BOTTOM_LEFT);
	
	// Process event
	button.setOnAction(e-> calQuad());
	// Create a scene and place it in the stage
	Scene scene = new Scene(gridPane, 400, 450);
	primaryStage.setTitle("QuadraticCalculator");
	primaryStage.setScene(scene);
	primaryStage.show();
	

}

	private void calQuad() {
		// get value from text fields
		double A = Double.parseDouble(tfInputValueOfA.getText());
		double B = Double.parseDouble(tfInputValueOfB.getText());
		double C = Double.parseDouble(tfInputValueOfC.getText());
		
		// create a calculator object
		QuadriaticFormula cal = new QuadriaticFormula(A, B, C);
		
		// Display solutions
		tfOutputX1.setText(String.format("%.2f", cal.getX1()));
		tfOutputX2.setText(String.format("%.2f", cal.getX2()));
	
}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
