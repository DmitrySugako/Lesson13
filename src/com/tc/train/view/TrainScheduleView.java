package com.tc.train.view;

import com.tc.train.bean.Train;
import com.tc.train.bean.TrainSchedule;

public class TrainScheduleView {

	public void print(TrainSchedule trains) {
		for (Train tr : trains.getTrains()) {
			System.out.println(tr);
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	public void printTrain(Train train) {
		System.out.println();
		System.out.println(train);
		System.out.println();
	}
}
