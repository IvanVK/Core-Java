package queuee;
import queuee.QueueDemo;

class Queue {

    char queue[];  //array that contains the queue
    int putloc, getloc;  //put and get indexes
    
    
    Queue(int size){
    	queue = new char[size + 1];  //allocate memory
    	putloc = getloc = 0;
    }
    
    
    //add symbol to the queue
    void put(char ch){
    	if(putloc == queue.length - 1){
    		System.out.println("the queue is full!");
    		return;
    	}	
    	putloc++;
    	queue[putloc] = ch;
    }
    
    
    //get symbol from the queue
    char get(){
    	if(getloc == putloc){
    		System.out.println("the queue is empty");
    		return (char) 0;
    	}
    	getloc++;
    	return queue[getloc];
    }
    
    //call queue demo
    public static void main(String[] args) {
    	QueueDemo.main();
    }
}
