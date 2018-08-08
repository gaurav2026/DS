package com.dlh.zambas.meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeMeetings {

	public static List<Meeting> mergeRanges(List<Meeting> sortedMeeting) {

		Collections.sort(sortedMeeting, new Comparator<Meeting>() {
			@Override
			public int compare(Meeting m1, Meeting m2) {
				return m1.getStartTime() - m2.getStartTime();
			}

		});

		List<Meeting> mergedMeeting = new ArrayList<Meeting>();
		Meeting lastMergedMeeting = sortedMeeting.get(0);
		for (int i = 1; i < sortedMeeting.size(); i++) {
			Meeting currentMeeting = sortedMeeting.get(i);
			if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
				lastMergedMeeting.setEndTime(Math.max(currentMeeting.getEndTime(), lastMergedMeeting.getEndTime()));
			} else {
				mergedMeeting.add(lastMergedMeeting);
				lastMergedMeeting = currentMeeting;
			}
		}
		mergedMeeting.add(lastMergedMeeting);
		return mergedMeeting;

	}

	public static void main(String[] args) {
		List<Meeting> meetingList = new ArrayList<Meeting>();
		meetingList.add(new Meeting(0, 1));
		meetingList.add(new Meeting(3, 5));
		meetingList.add(new Meeting(4, 8));
		meetingList.add(new Meeting(10, 12));
		meetingList.add(new Meeting(9, 10));

		List<Meeting> mergedList = mergeRanges(meetingList);
		for (Meeting m : mergedList) {
			System.out.println(m.getStartTime() + "  " + m.getEndTime());
		}
	}
}
