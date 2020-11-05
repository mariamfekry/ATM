import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class deposit {
	
	Stage stage;
	Scene scene;
    Menu menu;
	transaction transaction;
    int amount;

	
	public deposit(Stage stage ,transaction trans ){

		this.stage=stage;
	    this.transaction=trans;
	}


	public void preparescene() {	
		

		
		Button zero = new Button ("0");
		Button one = new Button ("1");
		Button two = new Button ("2");
		Button three = new Button ("3");
		Button four = new Button ("4");
		Button five = new Button ("5");
		Button six = new Button ("6");
		Button seven = new Button ("7");
		Button eight = new Button ("8");
		Button nine = new Button ("9");
		Button submit = new Button("submit");
		Button back = new Button("Back");
	    TextField moneyField = new TextField();
		
	    zero.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("0");			
				
			}
		});

	    one.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("1");			
				
			}
		});
	    two.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("2");			
				
			}
		});
	    three.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("3");			
				
			}
		});
	    four.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("4");			
				
			}
		});
	    five.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("5");			
				
			}
		});
	    six.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	            moneyField.appendText("6");			
				
			}
		});
	    seven.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("7");			
				
			}
		});
	    eight.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("8");			
				
			}
		});
	    nine.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
	        moneyField.appendText("9");			
				
			}
		});
	    submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
			amount=Integer.parseInt(moneyField.getText());
			
			transaction.deposit(amount);
		    
			}
		});
        back.setOnAction(new EventHandler<ActionEvent>() {

	   @Override
	   public void handle(ActionEvent event) {
	    
		stage.setScene(menu.getScene());

          	}
       });
        
	    GridPane grid = new GridPane();
	    grid.add(moneyField, 0,0);
	    grid.add(zero, 1, 0);
	    grid.add(one, 1,1);
	    grid.add(two, 1,2 );
	    grid.add(three,2,0);
	    grid.add(four,2, 1);
	    grid.add(five,2 , 2);
	    grid.add(six, 3 ,0);
	    grid.add(seven, 3, 1);
	    grid.add(eight, 3 , 2);
	    grid.add(nine, 4, 0);
	    grid.add(submit,0,5);
	    grid.add(back, 0, 6);
	    
	    grid.setAlignment(Pos.CENTER);
	    
	    grid.setPadding(new Insets(10,10,10, 10));
	    
	    grid.setVgap(8);
	    
	    grid.setHgap(10);
	    
	    grid.setStyle("-fx-background-color: LIGHTBLUE;");
	   
	    scene = new Scene(grid,400,300);

		}
	
	public Scene getScene() {
		
	return scene;
	
	}
	
	public void setmenu(Menu menu) {
	
		this.menu=menu;
	}
}
