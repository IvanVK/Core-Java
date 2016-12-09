package queuee;

public class QueueDemo {
	
	public static void main(){
		Queue bigQueue = new Queue(30);
		Queue smallQueue = new Queue(5);
		char ch;
		int i;
		
		System.out.println("we will use bigQueue to store the alphabet");
		
		//add to bigQueue
		for(i = 0; i < 26; i++)
			bigQueue.put((char) ('A' + i));
		
		System.out.println("bigQueue contents:");
		//print the content of bigQueue
		for(i = 0; i < 26; i++){
			ch = bigQueue.get();
			System.out.print(ch + " ");
		}
		
		
		//add to smallQueue
		for(i = 0; i < 5 ; i++){
			smallQueue.put((char)('Z' - i));
		}
		
		System.out.println("\n");
		
		System.out.println("content of smallQueue is:");
		for(i = 0; i< 5; i++){
			ch = smallQueue.get();
			System.out.print(ch + " ");
		}
		
	}
}
