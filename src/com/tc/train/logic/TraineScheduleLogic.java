package com.tc.train.logic;

import java.util.Collections;
import java.util.Comparator;
import com.tc.train.bean.Train;
import com.tc.train.bean.TrainSchedule;

public class TraineScheduleLogic {

	public Train find(int number, TrainSchedule trains) {
		for (Train tr : trains.getTrains()) {
			if (number == tr.getTrainNumber()) {
				return tr;
			}
		}
		return null;

	}

	public TrainSchedule sortByNumber(TrainSchedule trains) {
		Collections.sort(trains.getTrains(), new Comparator<Train>() {
			public int compare(Train a, Train b) {
				return a.getTrainNumber() - b.getTrainNumber();
			}
		});
		return trains;
	}

	public TrainSchedule sortByDepartureAndTime(TrainSchedule trains) {
		Collections.sort(trains.getTrains(), new Comparator<Train>() {
			public int compare(Train a, Train b) {
				if (a.getDestination().equals(b.getDestination())) {
					return a.getDepatureTime().compareTo(b.getDepatureTime());
				} else {
					return a.getDestination().compareTo(b.getDestination());
				}
			}
		});
		return trains;
	}
}
