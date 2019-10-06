package StrategyPattern;

public interface IStrategy {
	/*
	 * I have not yet proplerly built this interface because I need to have an idea of how the
	 * game will run first. The general idea is that the strategy will save its own
	 * (or have access to the game classes record of) past results from which to decide
	 * what it will do this round.
	 * 
	 * If the strategy is extremely simple, it may simply ignore the past results and pick
	 * based on effectively irrelevant criteria.
	 */
	
	public boolean decide();
}
