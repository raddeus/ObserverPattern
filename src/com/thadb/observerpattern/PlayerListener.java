package com.thadb.observerpattern;

public interface PlayerListener {
	public void playerMove(PlayerEvent e);
	public void playerJump(PlayerEvent e);
	public void playerInteract(PlayerEvent e);
}
