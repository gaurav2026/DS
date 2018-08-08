package com.dlh.zambas.meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeMeetingCopy {
	public static void main(String[] args) {
		List<Meeting> meetingList = new ArrayList<Meeting>();
		
		meetingList.add(new Meeting(0, 1));
		meetingList.add(new Meeting(3, 5));
		meetingList.add(new Meeting(4, 8));
		meetingList.add(new Meeting(10, 12));
		meetingList.add(new Meeting(9, 10));
		
		List<Meeting> mergedMeeting = mergedMeetings(meetingList);
		for(Meeting m : mergedMeeting){
			System.out.println(m.getStartTime()+ " " + m.getEndTime());
		}
	}

	private static List<Meeting> mergedMeetings(List<Meeting> meetingList) {
		Collections.sort(meetingList, new Comparator<Meeting>() {

			@Override
			public int compare(Meeting m1, Meeting m2) {
				return m1.getStartTime() - m2.getStartTime();
			}
		});
		List<Meeting> mergedMeetingList = new ArrayList<Meeting>();
		Meeting lastMergedMeeting = meetingList.get(0);
		for(int i=1;i<meetingList.size();i++){
			Meeting currentMeeting = meetingList.get(i);
			if(currentMeeting.getStartTime()<= lastMergedMeeting.getEndTime()){
				lastMergedMeeting.setEndTime(Math.max(currentMeeting.getEndTime(), lastMergedMeeting.getEndTime()));
			}else{
				mergedMeetingList.add(lastMergedMeeting);
				lastMergedMeeting = currentMeeting;
			}
		}
		mergedMeetingList.add(lastMergedMeeting);
		return mergedMeetingList;
	}
}
