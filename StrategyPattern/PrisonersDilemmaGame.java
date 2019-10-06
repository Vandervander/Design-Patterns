package StrategyPattern;

/**
 * This class runs a prisoners dilemma game between two IStrategy object instances for a
 * given number of rounds.
 *
 *
 */
public class PrisonersDilemmaGame {
	//Store both players strategies
	/** This stores the strategy that player one will use */
	private IStrategy player1;
	/** This stores the strategy that player two will use */
	private IStrategy player2;
	
	/*
	 * Not sure I need other variables to be available across methods.
	 * I'm intending to do pre-run set-up by editing the main method and then printing results.
	 * 
	 * Given this, all variables for a particular game will the stored within the playGame method.
	 */
	
	/**
	 * This constructs a new instance of PrisonersDilemmaGame and then does nothing.
	 * playGame can then be called on the object to run the specified number of rounds 
	 * @param player1
	 * @param player2
	 */
	public PrisonersDilemmaGame (IStrategy player1, IStrategy player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	/**
	 * Run a prisoners dilemma game between two IStrategy object instances for a
	 * given number of rounds.
	 * @param roundsInGame The number of rounds to run
	 */
	public void playGame (int roundsInGame) {
		//Initialise required variables
		int player1Score = 0; int player2Score = 0;
		int player1CooperateCount = 0; int player2CooperateCount = 0;
		int player1DefectCount = 0; int player2DefectCount = 0;
		/*
		 * Not sure if I'll do this, I think it's a better display of results than the above option
		 * int outcome1Count = 0; int outcome2Count = 0; int outcome3Count = 0; int outcome4Count = 0; 
		 */
		//Start game loop
		for (int roundNumber = 1; roundNumber <= roundsInGame; roundNumber++) {
			//TODO: Make this do everything
			playRound();
		}
		/*
		 * Finish the game and print results
		 */
		System.out.print("Player 1 Score: "+player1Score+"pts, Cooperated "+player1CooperateCount+" times and defected "+player1DefectCount+" times.");
		System.out.print("Player 2 Score: "+player2Score+"pts, Cooperated "+player2CooperateCount+" times and defected "+player2DefectCount+" times.");

	}
	
	/**
	 * 	For each round, a player will choose to Cooperate or Defect
	 * 	Depending on its strategy.
	 * 	
	 * 						|	player2 Cooperates		|	player2 Defects
	 * ---------------------|---------------------------|-------------------
	 * 	player1 Cooperates	|	Both players +1			|	player2 +2
	 * ---------------------|---------------------------|-------------------
	 * 	player1 Defects		|	player1 +2				|	Both players 0
	 * 																		
	 * 	This model does not use negative results (which might be some kind of wrong?)
	 * 	
	 * 	These results will be called:
	 * 
	 * 						|	player2 Cooperates		|	player2 Defects
	 * ---------------------|---------------------------|-------------------
	 * 	player1 Cooperates	|	Outcome #1				|	Outcome #2
	 * ---------------------|---------------------------|-------------------
	 * 	player1 Defects		|	Outcome #3				|	Outcome #4
	 * 																		
	 */
	private void playRound () {
		/*
		 * I think I will pass in the decisions to this method and let it handle the
		 * logic required to decide scoring of each round, as well as printing out
		 * results. The rather large down-side will be I have to pass a lot of
		 * arguments into this method.
		 * 
		 * The upside is that it should de-clutter the playGame method nicely.
		 * If I do change my mind later, copy-paste covers me so this should be fine! (:
		 */
		
		//Make players pick Coo/Def
		boolean p1Choice = player1.decide(); boolean p2Choice = player2.decide();
		if (p1Choice && p2Choice) {
			//Both Cooperate; 							Outcome #1
			//TODO
		} else if (p1Choice && !p2Choice) {
			//Player 1 Cooperates, Player 2 Defects; 	Outcome #2
			//TODO
		} else if (!p1Choice && p2Choice) {
			//Player 1 Defects, Player 2 Cooperates; 	Outcome #3
			//TODO
		} else {
			//Both Defect;								Outcome #4
			//TODO
		}
		
	}
	
	/**
	 * This runs a new game, with a given configuration
	 */
	public static void main (String args[]) {
		//Construct new PrisonersDilemmaGame instance, pass it two IStrategies
		//Start game loop
		//TODO: Make this do what the comments say
	}
}
