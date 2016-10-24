public class QueueTest{
	public static void main(String[] args){
		Queue q =  new Queue(5);
		q.queue("raprap");
		q.queue("me");
		q.queue("paul");
		q.queue("lupa");
		q.queue("luap");
		System.out.println(q);
		q.singit(1, "lala");
		System.out.println(q);
		String a = q.dequeue(2);
		System.out.println(a);
		System.out.println(q.size());
		a = q.dequeue();
		System.out.println(a);
		System.out.println(q.size());
	}
}
