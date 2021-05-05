package Entities;

import java.sql.Date;

import Abstracts.IEntity;

public class Campaign implements IEntity{
	
	private int id;
	private Date startsDate;
	private Date endsDate;
	private float percent;
	private String category;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartsDate() {
		return startsDate;
	}
	public void setStartsDate(Date startsDate) {
		this.startsDate = startsDate;
	}
	public Date getEndsDate() {
		return endsDate;
	}
	public void setEndsDate(Date endsDate) {
		this.endsDate = endsDate;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	
}
