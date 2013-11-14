package com.mlaskows.quiz.model.entities;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class Quiz {

	@ElementList
	List<Level> levels;

	public List<Level> getLevels() {
		return levels;
	}

	public void setLevels(List<Level> levels) {
		this.levels = levels;
	}

	@Override
	public String toString() {
		return levels.toString();
	}

}