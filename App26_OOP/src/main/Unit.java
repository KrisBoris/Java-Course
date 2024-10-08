package main;

import java.util.ArrayList;

public class Unit {

	ArrayList<Human> members; 
	
	Unit() {
		members = new ArrayList();
	}
	
	void addMember(Human member) {
		members.add(member);
	}
}
