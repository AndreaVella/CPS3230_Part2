package main;

import java.util.Random;
import main.ApiRequests;
import main.WebOperations;


public class newRunner {

	public void run() {
		final Random rand = new Random();
		ApiRequests api = new ApiRequests();
		WebOperations action = new WebOperations();
		int eventLogType = 100;
		boolean isLoggedInOnWebsite = false;
		
		for(int i = 0 ; i < 20 ; i++){
			final int randomNumber = rand.nextInt(15);
			
			if (randomNumber < 2 && isLoggedInOnWebsite == true){
				action.viewAlerts();
				eventLogType = 7;
				System.out.println("User viewed alerts");
			} 
			else if (randomNumber < 4 && isLoggedInOnWebsite == true) {
				String mockJson = "{\"alertType\":6,\"heading\":\"Gigaset GL390 GSM Dual-Sim Mobile Phone (Large Buttons and SOS Function)\",\"description\":\"Easy to use GSM phone for the elderly with comfort features and SOS-function.\",\"url\":\"https://www.klikk.com.mt/product/26660_gigaset-gl390-gsm-dual-sim-mobile-phone-large-buttons-and-sos-function-\",\"imageUrl\":\"https://s3-eu-west-1.amazonaws.com/klk-website/upload/product/26660/gigaset-gl390-gsm-dual-sim-mobile-phone-large-buttons-and-sos-function-1662468849-1.png\",\"postedBy\":\"afdda8c8-1fd0-4d95-bbab-22d6dc3dc5b4\",\"priceInCents\":5595}";
		        api.postAlert(mockJson);
		        eventLogType = 0;
		        System.out.println("User posted an alert");
			}
			else if (randomNumber < 6 && isLoggedInOnWebsite == true){
				api.deleteAlerts();
				eventLogType = 1;
				System.out.println("User deleted all alerts");
			}
			else if (randomNumber < 8  && isLoggedInOnWebsite == true)
			{
				action.logOut();
				isLoggedInOnWebsite = false;
				System.out.println("User logged out");
			}
			else if (randomNumber < 10  && isLoggedInOnWebsite == false){
				action.logOn();
				isLoggedInOnWebsite = true;
				System.out.println("User logged in");
			}
		}
	}


	public static void main(String[] args) {
		final newRunner runner = new newRunner();
		runner.run();
	}
	
	
}
