
public class Mytransaction {

String transtype;
int money;

public Mytransaction(String transtype,int money) {

	this.transtype=transtype;
	this.money=money;
}

public String gettranstype() {

	return transtype;
}
public int gettransamount() {
	return money;
}

}
