package LockedMe.com;

public class LockedMeMain {

	public static void main(String[] args) {
FileOperations.createMainFolderIfNotPresent("main");
MenuOptions.printWelcomeScreen("LockedMe", "suhas");
		
		HandleOptions.handleWelcomeScreenInput();

	}

}
