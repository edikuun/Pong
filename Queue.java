import java.util.*;
public class Queue{
	private String[] elements;
	private int count;
	private static final int DEFAULT_SIZE = 10;

	public Queue(int n){
		if (n <= 0){
			throw new IllegalArgumentException("Invalid size");
		}
		else{
			elements = new String[n];
		}
	}

	public Queue(){
		this(DEFAULT_SIZE);
	}

	public int size(){
		return count;
	}

	public void queue(String item){
		if(count >= elements.length){
		String[] newElements = Arrays.copyOf(elements, elements.length + DEFAULT_SIZE);
		newElements[count++] = item;
		elements = newElements;
		}
		else{
			elements[count++] = item;
		}
	}

	public String dequeue(){
		if (count <= 0){
			throw new ArrayIndexOutOfBoundsException("e");
		}
		else{
			String ret = elements[0];
			String r = "";
			for (int i = 1; i < count - 1; i++){
				elements[i - 1] = elements[i];
			}
			count--;
			return ret;
		}
	}

	public String peek(){
		return elements[count-1];
	}

	public String dequeue(int n){
		if (n <= 0){
			throw new IllegalArgumentException("e");
		}
		else{
			String res = "";
			for (int i = 0; i < n; i++){
				res = dequeue();
			}
			return res;
		}
	}

	public void singit(int pos, String x){
		/*String store = elements[pos];
		elements[pos] = x;
		elements[pos+1] = store;
		String r = "";
		for (int i = 2; i < count - 1; i++){
			r  = elements[pos+i];
			elements[pos]
		}*/
		if(count >= elements.length){
		String[] newElements = Arrays.copyOf(elements, elements.length + DEFAULT_SIZE);
		//newElements[count++] = x;
		elements = newElements;
		}
		for (int i = count; i != pos; i--){
			elements[i] = elements[i - 1];
		}
		elements[pos] = x;
		count++;	
		
		
		
	} 
	public String toString(){
		if (count == 0){
			return "EMPTY";
		}
		else{
			String ret = "";
			for (int i = 0; i < count - 1; i++){
				ret += elements[i] + ", ";
			}
			return ret + elements[count - 1];
		}
	}
}