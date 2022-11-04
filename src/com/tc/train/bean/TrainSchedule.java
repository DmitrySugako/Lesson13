package com.tc.train.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainSchedule {

	private List<Train> trains = new ArrayList<Train>();

	public TrainSchedule() {
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	public Train getTrains(int index) {
		return trains.get(index);
	}

	public void setTrains(int index, Train train) {
		trains.set(index, train);
	}

	public void add(Train train) {
		trains.add(train);
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainSchedule other = (TrainSchedule) obj;
		return Objects.equals(trains, other.trains);
	}

	@Override
	public String toString() {
		return "TrainSchedule [trains=" + trains + "]";
	}

}
