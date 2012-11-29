package com.thadb.observerpattern;

public class GameExtend extends PlayerAdapter{

	private Player player1;
	private Player player2;
	
	public GameExtend(){
		setPlayer1(new Player("Player 1"));
		setPlayer2(new Player("Player 2"));
		player1.addPlayerListener(this);
		player2.addPlayerListener(this);
	}

	@Override
	public void playerMove(PlayerEvent e) {
		Player p = e.getSource();
		System.out.println("Game: Received playerMove from "+p+" at position "+p.getPosition());
	}
	
	public Player getPlayer1() {
		return player1;
	}
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public void sendInput(String input) {
		if (input.equals("w")){
			player1.move(Direction.UP);
		}
		if (input.equals("a")){
			player1.move(Direction.LEFT);
		}
		if (input.equals("s")){
			player1.move(Direction.DOWN);
		}
		if (input.equals("d")){
			player1.move(Direction.RIGHT);
		}
		
		if (input.equals("8")){
			player2.move(Direction.UP);
		}
		if (input.equals("4")){
			player2.move(Direction.LEFT);
		}
		if (input.equals("5")){
			player2.move(Direction.DOWN);
		}
		if (input.equals("6")){
			player2.move(Direction.RIGHT);
		}	
	}



}
