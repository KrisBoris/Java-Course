package main;

public class Friend {

	String name;
	static int numberOfFriends;	// Initializes with 0
	
	Friend(String name) {
		this.name = name;
		numberOfFriends++;
	}
	
	static int friendsCount() {
		return numberOfFriends;
	}
}
