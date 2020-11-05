import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
public class loginpage {
	
	Stage stage;
    Menu menu;
    Scene scene;
	Authentication access;

	
public loginpage(Stage stage) {
	
	this.stage=stage;

}
	public void preparescene(){
    	
    
	access = new Authentication();
	

	Label validationlabel = new Label();
	Label cardnumberlabel = new Label("Card Number:");
    PasswordField cardnumberfield = new PasswordField();
    Button enter=new Button("Enter");
    enter.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 

	enter.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
		
			String cardnumber = cardnumberfield.getText();
			boolean valid = access.validate(cardnumber);
			if(valid) {
					stage.setScene(menu.getScene());
				}
			else {

			validationlabel.setText("wrong number try Again");		
			
			}
			
		}
	});
    
    GridPane grid = new GridPane();
    
    grid.setPadding(new Insets(10,10,10, 10));
    
    grid.setVgap(8);
    
    grid.setHgap(10);
    
    grid.setAlignment(Pos.CENTER);
    
    grid.setStyle("-fx-background-color: LIGHTBLUE;");
    
    cardnumberlabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
    
    validationlabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
    
    GridPane.setConstraints(cardnumberlabel ,0 ,0);
    
    GridPane.setConstraints(cardnumberfield ,1 ,0);
    
    GridPane.setConstraints(enter,1,1);
    
    GridPane.setConstraints(validationlabel,1,2);
    
    grid.getChildren().addAll(cardnumberlabel,cardnumberfield,enter,validationlabel);
    
    scene = new Scene(grid,400,300);
	
	}
	   
 public Scene getScene()
 {
	 return this.scene;
	
 }

 public void setmenu(Menu menu)
 {
	this.menu=menu;
 }

}
