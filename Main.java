package portManagement;

import java.util.*;

public class Main {
	 private static ArrayDeque<Container> containerStack = new ArrayDeque<>();
	 private static ArrayDeque<Ship> shipQueue = new ArrayDeque<>();
	 private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice = 0;
		
		do {
			System.out.println("\n=== Port Container Management System ===");
            System.out.println("[1] Store container (push)");
            System.out.println("[2] View port containers");
            System.out.println("[3] Register arriving ship (enqueue)");
            System.out.println("[4] View waiting ships");
            System.out.println("[5] Load next ship");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
            	storeContainer();
            	break;
            case 2:
            	viewContainer();
            	break;
            case 3:
            	registerShip();
            	break;
            case 4:
            	viewShip();
            	break;
            case 5:
            	loadNextShip();
            	break;
            case 0:
            	System.out.println("Exiting program");
            dafault:
            	System.out.println("Invalid Choice, Try Again.");
            }
			
		}while(choice != 0);
		 

	}
	public static void storeContainer() {
		System.out.println("Enter container ID: ");
		String id = sc.nextLine();
		System.out.println("Enter description: ");
		String desc = sc.nextLine();
		System.out.println("Enter weight: ");
		double weight = sc.nextInt();
		sc.nextLine();
		
		Container container = new Container(id,desc,weight);
		containerStack.push(container);
		System.out.println("\nStore: " + container);
	}
	

	private static void viewContainer() {
		if(containerStack.isEmpty()) {
			System.out.println("\nNo Cntainer at the port.");
			return;
		}
		System.out.print("\nTop ->");
		for(Container c : containerStack) {
			System.out.println(c);
		}
		System.out.print("<- Bottom");
		
	}


	private static void registerShip() {
		System.out.print("Enter ship name: ");
		String name = sc.nextLine();
		System.out.print("Enter captain name: ");
		String captain = sc.nextLine();
		
		Ship s = new Ship(name, captain);
		shipQueue.add(s);
		System.out.println("\nRegistered: " + s);
		
	}


	private static void viewShip() {
		if(shipQueue.isEmpty()) {
			System.out.println("\n no ships available.");
			return;
		}
		
		System.out.print("\nFront ->");
		for(Ship s: shipQueue) {
			System.out.println(s);
		}
		System.out.println("<- Rear");
		
	}


	private static void loadNextShip() {
		if(containerStack.isEmpty()) {
			System.out.println("No container available to load.");
			return;
		}
		if(shipQueue.isEmpty()) {
			System.out.println("No ship available.");
			return;
		}
		
		Container c = containerStack.pop();
		Ship s = shipQueue.poll();
		
		System.out.println("\nLoaded: " + c + "->" + s);
		System.out.println("Remaining container: " + containerStack.size());
		System.out.println("Remaining ship: " + shipQueue.size());
		
	}


	

}
