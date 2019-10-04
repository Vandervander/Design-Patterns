package ObserverPattern;

/**
 * This class is a very simple implementation of the IBroadcaster interface
 *  
 */
public class SimpleBroadcaster implements IBroadcaster{

	public boolean add(ISubscriber newSubscriber) {
		/*
		 * If duplicate references to a Subscriber instance are added to
		 * the subscriberList, problems like updating a Subscriber twice
		 * for each broadcast may occur
		 */
		if (subscriberList.contains(newSubscriber)) {
			return false;
		}
		return subscriberList.add(newSubscriber);
	}

	public boolean remove(ISubscriber removeSubscriber) {
		return subscriberList.remove(removeSubscriber);
	}

	public void broadcast(String broadcastedUpdate) {
		for (ISubscriber subscriber: subscriberList) {
			subscriber.update(broadcastedUpdate);
		}
	}
	
	//TODO: Add a changing state
	//TODO: Add a good toString method for testing reasons
}
