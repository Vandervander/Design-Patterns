package ObserverPattern;

/**
 * This class is a very simple implementation of the ISubscriber interface
 *
 */
public class SimpleSubscriber implements ISubscriber {
	//This is unhelpfully vague
	private Object o = null;
	//Make this mean something
	private int instanceNumber = 0;
	
	public void update(String broadcastedUpdate) {
		o = broadcastedUpdate;
	}
	
	//TODO: add a string parser for laughs
	
	//TODO: improve this method
	public String toString () {
		return "SimpleSubscriber instance #"+instanceNumber+" containing: "+o+"\n";
	}
}
