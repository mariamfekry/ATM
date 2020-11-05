import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Menu {
	
	int i;
    transaction transaction;
    Stage stage;
	Scene scene;
	loginpage loginpage;
	withdraw Withdraw;
	deposit Deposit;
	Mytransaction mytransaction;
	
	public Menu(Stage stage, transaction transaction) {
		this.stage=stage;
		this.transaction=transaction;
	}
	

	
	public void preparescene() {
	
	
	Label historylabel2 = new Label();
    Label historylabel = new Label();
	Label currentbalancelabel = new Label();
;

    Button withdraw=new Button("withdraw");//withdraws if there is enough balance
    Button deposit = new Button("Deposit");//add money to your balance
	Button currentbalance = new Button("Balance Inquiry");//shows current balance
	Button next = new Button("Next");
	Button previous = new Button("Previous");


	
	
	//Layout	
	
    GridPane grid=new GridPane();
	grid.add(currentbalancelabel, 0, 8);
	
	grid.add(withdraw, 0 ,  1 );
	grid.add(deposit,0,2);
	grid.add(currentbalance,0,3);
	grid.add(next,0,4);
	grid.add(previous,0,5);
    grid.add(historylabel,0,6);
    grid.add(historylabel2,1,6);
    
    grid.setAlignment(Pos.CENTER);
    
    grid.setPadding(new Insets(10,10,10, 10));
    
    grid.setVgap(8);
    
    grid.setHgap(10);
    
    grid.setStyle("-fx-background-color: LIGHTBLUE;");
    
    withdraw.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
    deposit.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
    currentbalance.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
    next.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
    previous.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
    
    
    
    
//taking money
	
    withdraw.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
		
			stage.setScene(Withdraw.getScene());
		
			
		}
	});
//adding money	
	deposit.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			stage.setScene(Deposit.getScene());
	
		}
	});
//current balance execution
	currentbalance.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
		int x = transaction.balanceInquiry();
			
		currentbalancelabel.setText("Current balance is : "+String.valueOf(x));

		}
	});
	
	
	
	next.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			if(transaction.trans.size()> i) {
			
			historylabel.setText(transaction.trans.get(i).gettranstype());
			
			historylabel2.setText(String.valueOf(transaction.trans.get(i).gettransamount()));
		
			i++;
		}
			else
			{
				
			historylabel2.setText("no more ");
			historylabel.setText("transactions");
			
			}
		}

	});	
		
// previous button history

	previous.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent event) {

		
		if(transaction.trans.size() >= i) {
			if(i>0) { 
				
			
			historylabel2.setText(String.valueOf(transaction.trans.get(i-1).gettransamount()));
			historylabel.setText(transaction.trans.get(i-1).gettranstype());
		    
			i-=1;
			
			}
			else {
				historylabel.setText("transactions");
				historylabel2.setText("no more ");
				
			}
		}
		else {
			historylabel.setText("transactions");
			historylabel2.setText("no more ");
			
		}
	}
});

	scene =new Scene(grid,400,300);

	}
    public void setloginpage(loginpage loginpage) {
    	
    	this.loginpage=loginpage;
    }
    
	public Scene getScene() {
		return scene;
	}
	public void setwithdraw(withdraw Withdraw) {
		this.Withdraw = Withdraw;
	}
	public void setdeposit(deposit Deposit) {
	
		this.Deposit = Deposit;
	}
}
