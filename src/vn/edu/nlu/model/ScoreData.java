package vn.edu.nlu.model;

import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class ScoreData implements Subject {
	private int appleScore, mushroomScore, starScore;
	private List<Observer> observers;

	public ScoreData() {
		this.appleScore = 0;
		this.mushroomScore = 0;
		this.starScore = 0;
		observers = new ArrayList<Observer>();
	}

	public int getAppleScore() {
		return appleScore;
	}

	public void setAppleScore(int appleScore) {
		this.appleScore = appleScore;
	}

	public int getMushroomScore() {
		return mushroomScore;
	}

	public void setMushroomScore(int mushroomScore) {
		this.mushroomScore = mushroomScore;
	}

	public int getStarScore() {
		return starScore;
	}

	public void setStarScore(int starScore) {
		this.starScore = starScore;
	}

	@Override
	public void register(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void unRegister(Observer obs) {
		int index = observers.indexOf(obs);
		if (index > -1)
			observers.remove(index);
	}

	@Override
	public void notifyObs() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	@Override
	public void setChange() {
		notifyObs();
	}

	@Override
	public void setScore(int apples, int mushrooms, int stars) {
		this.appleScore = apples;
		this.mushroomScore = mushrooms;
		this.starScore = stars;
	}

}
