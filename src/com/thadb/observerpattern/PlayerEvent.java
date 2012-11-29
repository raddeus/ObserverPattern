package com.thadb.observerpattern;

public class PlayerEvent {

	private Player source;

	public PlayerEvent(Player source){
		this.source = source;
	}
	
	public Player getSource() {
		return source;
	}

}
