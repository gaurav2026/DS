package com.dlh.zambas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeMeetings {

	public static List<Meeting> mergeRanges(List<Meeting> meetings) { // make a copy so we don't destroy the input
	    List<Meeting> sortedMeetings = new ArrayList<>();
	    for (Meeting meeting: meetings) {
	        Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
	        sortedMeetings.add(meetingCopy);
	    }

	    // sort by start time
	    Collections.sort(sortedMeetings, new Comparator<Meeting>() {
	        @Override
	        public int compare(Meeting m1, Meeting m2) {
	            return m1.getStartTime() - m2.getStartTime();
	        }
	    });

	    // initialize mergedMeetings with the earliest meeting
	    List<Meeting> mergedMeetings = new ArrayList<>();
	    mergedMeetings.add(sortedMeetings.get(0));

	    for (Meeting currentMeeting : sortedMeetings) {

	        Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

	        // if the current meeting overlaps with the last merged meeting, use the
	        // later end time of the two
	        if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
	            lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

	        // add the current meeting since it doesn't overlap
	        } else {
	            mergedMeetings.add(currentMeeting);
	        }
	    }

	    return mergedMeetings;}
	
	public static void main(String[] args) {
		 Meeting[] meetings = {
		            new Meeting(0, 1),
		            new Meeting(3, 5),
		            new Meeting(4, 8),
		            new Meeting(10, 12),
		            new Meeting(9, 10)
		        };

		        List<Meeting> result = mergeRanges(Arrays.asList(meetings));
		        for (Meeting meeting: result) {
		            System.out.printf("(%d, %d) ", meeting.getStartTime(),
		                                meeting.getEndTime());
		        }
		        System.out.println();
	}
}
