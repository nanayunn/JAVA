package com.sds;

public class marker {
	String title;
	Double lat;
	Double lng;
	String img;
	public marker(String title, Double lat, Double lng) {
		this.title = title;
		this.lat = lat;
		this.lng = lng;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "marker [title=" + title + ", lat=" + lat + ", lng=" + lng + "]";
	}
	
	
}
