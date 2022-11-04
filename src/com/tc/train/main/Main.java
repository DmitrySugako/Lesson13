package com.tc.train.main;

import java.util.Date;

import com.tc.train.bean.Train;
import com.tc.train.bean.TrainSchedule;
import com.tc.train.logic.TraineScheduleLogic;
import com.tc.train.view.TrainScheduleView;

public class Main {

	public static void main(String[] args) {
		Train tr1 = new Train(445, "London", new Date(2022 - 1900, 8, 1, 15, 55));
		Train tr2 = new Train(447, "Amsterdam", new Date(2022 - 1900, 8, 2, 17, 35));
		Train tr3 = new Train(444, "Paris", new Date(2022 - 1900, 8, 2, 10, 4));
		Train tr4 = new Train(446, "Munich", new Date(2022 - 1900, 8, 3, 15, 15));
		Train tr5 = new Train(443, "Munich", new Date(2022 - 1900, 8, 3, 17, 30));

		TrainSchedule schedule = new TrainSchedule();
		schedule.add(tr1);
		schedule.add(tr2);
		schedule.add(tr3);
		schedule.add(tr4);
		schedule.add(tr5);

		TraineScheduleLogic sLogic = new TraineScheduleLogic();
		TrainScheduleView view = new TrainScheduleView();

		view.print(schedule);
		sLogic.sortByNumber(schedule);
		view.print(schedule);
		sLogic.sortByDepartureAndTime(schedule);
		view.print(schedule);

		view.printTrain(sLogic.find(444, schedule));

	}
}
