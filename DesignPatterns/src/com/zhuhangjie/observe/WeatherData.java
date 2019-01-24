package com.zhuhangjie.observe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WeatherData {
	private List<BoardInterface> observes= new ArrayList<BoardInterface>();
	private int temp;
	private int wid;
	private int pre;
	
	public void measurementsChanged() {
		int t = getTemp();
		int w = getWid();
		int p = getPre();
		
		List<BoardInterface> o = getObserves();
		
		for (BoardInterface board : o) {
			board.update(t, w, p);
		}
	}

	public boolean addBoard(BoardInterface board) {
		return getObserves().add(board);
	}
	
	public void removeBoard(BoardInterface board) {
		int i = observes.indexOf(board);
		observes.remove(i);
	}
	
	
	public List<BoardInterface> getObserves() {
		return observes;
	}

	public void setObserves(List<BoardInterface> observes) {
		this.observes = observes;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public int getPre() {
		return pre;
	}

	public void setPre(int pre) {
		this.pre = pre;
	}
	
	
	
}
