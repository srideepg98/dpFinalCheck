package Observation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer shr=new Admin("Shreya");
		Observer sam=new Admin("Saima");
		Observer aks=new Admin("Akshita");
		
		INotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(shr);
		notificationService.addSubscriber(sam);
		notificationService.addSubscriber(aks);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(shr);
		
		

	}

}
