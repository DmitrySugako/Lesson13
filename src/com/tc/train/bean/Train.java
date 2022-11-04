package com.tc.train.bean;

import java.util.Date;
import java.util.Objects;

public class Train {
	private int trainNumber;
	private String destination;
	private Date depatureTime;

	public Train() {
	}

	public Train(int trainNumber, String destination, Date depatureTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.depatureTime = depatureTime;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(Date depatureTime) {
		this.depatureTime = depatureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depatureTime, destination, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(depatureTime, other.depatureTime) && Objects.equals(destination, other.destination)
				&& trainNumber == other.trainNumber;
	}

	@Override
	public String toString() {
		return "[Number: " + trainNumber + "| Destination: " + destination + "| Depature Time: " + depatureTime + "]";
	}

}
