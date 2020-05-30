package collectionframework;

import java.util.PriorityQueue;

public class QueueBasicsOfQueue {

	public static void main(String[] args) {
		System.out.println("There are two types of queues:\n1. Priority Queue \n2. Link List");
		System.out.println("\nPRIORITY QUEUE: ");
		
		PriorityQueue<String> elements = new PriorityQueue<String>();
		elements.add("Java");
		elements.add("Python");
		elements.add("Java");
		elements.add("C");
		elements.add("C++");
		elements.add("Java");
		elements.add("Dart");
		elements.add("Kotlin");
		elements.add("Java");
		System.out.println(elements);

		// peek() method is used to get the head of the queue.
		System.out.println("\nHead of the queue: " + elements.peek());
		
/*		
 * poll() removes the head of the queue, "Java" will be removed. It is similar to remove() method.
 * The only difference is that poll() will return null if the queue is empty while remove() will throw an exception.
*/		elements.clear();
		elements.poll();
		System.out.println("poll() removes the head of the queue, elements: " + elements);
		
		elements.remove(); // removes only a single instance of the object.
		System.out.println("\nRemove a single instance of Java, elements: " + elements);
		
		System.out.println("\nDoes queue contain \"Java\": " + elements.contains("Java"));
		
		Object[] languages = elements.toArray();
		System.out.println("\nPrinting the elements in the queue as an array of objects: ");
		for(int i=0; i<languages.length; i++)
			System.out.print(languages[i] + "\t");
	}

}
