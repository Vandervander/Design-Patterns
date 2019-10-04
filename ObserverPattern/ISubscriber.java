package ObserverPattern;

/**
 * The Subscriber interface defines a class to
 * observe a Broadcaster instance; it has
 * interest in the STATE of the Broadcaster,
 * and it updates when the STATE changes.
 */
interface ISubscriber {
	/**
	 * This method takes in the String from the Broadcaster's broadcast method
	 * @param broadcastedUpdate A String representing the change in Broadcaster STATUS 
	 */
	void update (String broadcastedUpdate);
	/* 
	 * Notably, this setup also allows multiple subscriptions to be held by one subscriber instance
	 * although this would mean that different broadcast types would have to be handled properly
	 * */
}