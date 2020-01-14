package com.sds;

public class news {
	int rank;
	String title;
	int ud;
	public news(int rank, String title, int ud) {
		this.rank = rank;
		this.title = title;
		this.ud = ud;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getUd() {
		return ud;
	}
	public void setUd(int ud) {
		this.ud = ud;
	}
	@Override
	public String toString() {
		return "news [rank=" + rank + ", title=" + title + ", ud=" + ud + "]";
	}
	
}
