import java.util.Date;

public class Time {

	private int value;
	private long time;

	Time(int value, Date date) {
		this.value = value;
		this.time = date.getTime();
	}

	public int getValue() {
		return value;
	}

	public long getTime() {
		return time;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Time t1 = new Time(10, new Date());
		Thread.sleep(2000);
		Time t2 = new Time(20, new Date());
		
		System.out.println(t1.getTime());
		System.out.println(t2.getTime());
		
		System.out.println(t1.getTime()-t2.getTime());
	}
}
