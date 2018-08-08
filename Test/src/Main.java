import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	Map<Integer, Time> map = new HashMap<Integer, Time>();

	public void put(int key, int val) {
		Time t = new Time(val, new Date());
		map.put(key, t);
	}

	public void expire(long timeInterval) {
		Iterator<Map.Entry<Integer, Time>> iter = map.entrySet().iterator();
		while (iter.hasNext())  {
			Entry<Integer, Time> entry = iter.next();
			int k = entry.getKey();
			Time time = map.get(k);
			System.out.println(time.getTime());
			if (Math.abs(time.getTime() - timeInterval) > 2) {
				iter.remove();
			}
		}
	}

	public Map<Integer, Time> getMap() {
		return map;
	}

	public static void main(String[] args) throws InterruptedException {
		Main m = new Main();
		m.put(1, 10);
		m.put(2, 20);
		Thread.sleep(3000);
		m.put(3, 30);
		m.expire(new Date().getTime());
		System.out.println(m.getMap());

	}
}
