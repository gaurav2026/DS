import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

	class Event implements Comparable<Event> {
		int startTime;
		int endTime;

		public int getStartTime() {
			return startTime;
		}

		public void setStartTime(int startTime) {
			this.startTime = startTime;
		}

		public int getEndTime() {
			return endTime;
		}

		public void setEndTime(int endTime) {
			this.endTime = endTime;
		}

		@Override
		public int compareTo(Event o) {
			return this.getEndTime() - o.getEndTime();
		}

		public Event(int startTime, int endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}

		public Event() {
		}

	}

	static void findMaximumEvents(String[] eventDetails) {
		List<Event> eventList = new ArrayList<>();
		for (int i = 0; i < eventDetails.length; i++) {
			Event temp = new Solution().new Event();
			String[] tempArr = eventDetails[i].split("\\s+");
			temp.setStartTime(Integer.parseInt(tempArr[0]));
			temp.setEndTime(Integer.parseInt(tempArr[1]));
			eventList.add(temp);
		}

		Collections.sort(eventList);

		int eventTable[] = new int[eventList.size()];
		eventTable[0] = 1;

		for (int i = 1; i < eventList.size(); i++) {
			int maxEvent = 1;
			int l = search(eventList, i);
			if (l != -1) {
				maxEvent += eventTable[l];
			}

			eventTable[i] = Math.max(maxEvent, eventTable[i - 1]);

		}

		System.out.println(eventTable[eventList.size() - 1]);
	}

	static public int search(List<Event> eventList, int index) {
		int lo = 0, hi = index - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (eventList.get(mid).getEndTime() < eventList.get(index).getStartTime()) {
				if (eventList.get(mid + 1).getEndTime() < eventList.get(index).getStartTime())
					lo = mid + 1;
				else
					return mid;
			} else
				hi = mid - 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		String[] ev = new String[4];
		ev[0] = "4 5";
		ev[1] = "3 4";
		ev[2] = "5 6";
		ev[3] = "2 3";

		// new Solution().findMaximumEvents(ev);
		Solution sol = new Solution();
		List<Meeting> meetingList = new ArrayList<Meeting>();
		meetingList.add(new Meeting(4, 5));
		meetingList.add(new Meeting(3, 4));
		meetingList.add(new Meeting(5, 6));
		// meetingList.add(sol.new Event(10, 12));
		meetingList.add(new Meeting(2, 6));

		sol.findMaximumEvents(meetingList);
	}

	public void findMaximumEvents(List<Meeting> eventList) {
		Collections.sort(eventList, new Comparator<Meeting>() {

			@Override
			public int compare(Meeting o1, Meeting o2) {
				return o1.getEndTime() - o2.getEndTime();
			}
		});
		
		List<Meeting> mergedMeeting = new ArrayList<Meeting>();
		Meeting lastEvent = eventList.get(0);
		mergedMeeting.add(lastEvent);

		for (int i = 1; i < eventList.size(); i++) {
			Meeting currentEvent = eventList.get(i);
			if(currentEvent.getStartTime() > lastEvent.getEndTime()){
				mergedMeeting.add(currentEvent);
				lastEvent = currentEvent;
			}
		}

		System.out.println(mergedMeeting.size());
		for(Meeting meet : mergedMeeting){
			System.out.println(meet.getStartTime()+ " " + meet.getEndTime());
		}
	}
	
	
}
