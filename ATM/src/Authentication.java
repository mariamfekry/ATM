public class Authentication {

public boolean validate (String cardnumber) {
	
	if(cardnumber.contentEquals("5614")) {
		return true;
	}
	else {
		return false;
		}
  }
}
