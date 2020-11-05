import javafx.application.Application;
import javafx.stage.Stage;

public class ATM extends Application{

	public static void main(String[]args) {
		launch(args);
	   } 
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		primaryStage.setTitle("ATM");

		transaction trans1= new transaction();
		loginpage loginpage = new loginpage(primaryStage);
		Menu menu = new Menu(primaryStage,trans1);
		withdraw withdraw = new withdraw(primaryStage, trans1);
		deposit deposit = new deposit (primaryStage,trans1);

		
		loginpage.preparescene();
		menu.preparescene();
		withdraw.preparescene();
		deposit.preparescene();
		
		loginpage.setmenu(menu);
		menu.setwithdraw(withdraw);
		withdraw.setmenu(menu);
		menu.setdeposit(deposit);
		deposit.setmenu(menu);
		
	
		primaryStage.setScene(loginpage.getScene());
		setUserAgentStylesheet(STYLESHEET_CASPIAN);
	    primaryStage.show();
		
	}

}
