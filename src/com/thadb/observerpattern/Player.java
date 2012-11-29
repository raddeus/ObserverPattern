package com.thadb.observerpattern;

import java.util.HashSet;
import java.util.Set;

public class Player {

	private Set<PlayerListener> listeners;
	private String name;
	private Position position;
	
	public Player(String name){
		this.name = name;
		listeners = new HashSet<PlayerListener>();
		this.position = new Position();
	}
	
	public synchronized void addPlayerListener(PlayerListener listener){
		listeners.add(listener);
	}
	
	public synchronized void removePlayerListener(PlayerListener listener){
		listeners.remove(listener);
	}
	
	protected synchronized void firePlayerMoveEvent(){
		System.out.println("Player: "+this.getName()+" fired a PlayerMoveEvent.");
		PlayerEvent e = new PlayerEvent(this);
		for (PlayerListener listener : listeners){
			listener.playerMove(e);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

	public void move(Direction dir) {	
		position.setY(position.getY()+dir.getY());
		position.setX(position.getX()+dir.getX());
		firePlayerMoveEvent();
	}
}
