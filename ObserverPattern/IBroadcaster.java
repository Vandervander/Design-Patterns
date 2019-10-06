package ObserverPattern;

import java.util.ArrayList;

/**
 * The Broadcaster interface defines a class to
 * be observable; it has a STATE that changes,
 * and when its state changes it broadcasts
 * THAT to its subscribers.
 * 
 * NB: THAT may either be simply acknowledgement
 * of a change, or a representation of the 
 * change itself
 * 
 * Because of the Broadcaster setup, every
 * Subscriber is assumed to be interested in
 * every STATE change broadcasted; this may
 * not always be the case.
 * 
 * This might be overcome by either having
 * slave objects broadcast changes for each
 * type of STATE change, or by designing a
 * Broadcaster to have multiple lists of
 * Subscribers interested in different types
 * of STATE changes.
 *
 */
interface IBroadcaster {
	/*
	 * These fields and methods maintain the
	 * records of all Subscribers served by
	 * the Broadcaster instance.
	 * 
	 * This comment is probably unnecessary.
	 */
	/**
	 * This is a list of all "subscribed" Subscriber instances
	 */
	public ArrayList<ISubscriber> subscriberList = new ArrayList<ISubscriber>();
	
	/**
	 * This method adds a new Subscriber to
	 * the Broadcaster instances collection.
	 * @param s The new Subscriber
	 * @return True if successful, false if
	 * Subscriber already subscribed, or for
	 * other errors.
	 */
	boolean add (ISubscriber newSubscriber);
	
	/**
	 * This method removes a Subscriber from
	 * the Broadcaster instances collection.
	 * @param s
	 * @return True if successful, false if
	 * Subscriber not subscribed, or for
	 * other errors.
	 */
	boolean remove (ISubscriber removeSubscriber); //Clumsy naming?
	
	/*
	 * Because this is intended to be a simple
	 * project (but I do want some flexibility) this
	 * method will output a string. I find this
	 * the best compromise; blank strings or
	 * error codes can easily by written and
	 * returned, or alternatively a string
	 * representing the change can the written
	 * and then parsed.
	 * 
	 * For more complex Broadcasters I 
	 * intend to broadcast the representation
	 * of the change rather than simply
	 * that there has been a change, as the
	 * alternative would require each
	 * interested Subscriber to then
	 * poll the Broadcaster for details.
	 * I would rather minimise Subscriber
	 * polling, to emulate network efficiency
	 * concerns.
	 * 
	 * I couldn't use the name "notify" for
	 * this method because it is already in use
	 * 
	 */
	/**
	 * This method sends a String representing
	 * the STATE change in the Broadcaster
	 * instance to every Subscriber.
	 * 
	 * @param broadcastedUpdate The String representing the STATUS change of the Broadcaster
	 * NB: This String may be empty
	 */
	void broadcast (String broadcastedUpdate);
	
}