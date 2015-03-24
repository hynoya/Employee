package webapp.model.weather;

import java.util.Date;

//<current windspeed="9" shortday="금" day="금요일" winddisplay="9 km/h 서북서" humidity="22" feelslike="7" observationpoint="Seoul" observationtime="12:00:00" date="2015-03-13" skytext="구름 없음" skycode="32" temperature="8"/>
public class Current {
	
	String windspeed;
	String shortday;
	String day;
	String winddisplay;
	String humidity;
	String feelslike;
	String observationpoint;
	String observationtime;
	Date date;
	String skytext;
	String skycode;
	Integer temperature;
	
	public String getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(String windspeed) {
		this.windspeed = windspeed;
	}
	public String getShortday() {
		return shortday;
	}
	public void setShortday(String shortday) {
		this.shortday = shortday;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getWinddisplay() {
		return winddisplay;
	}
	public void setWinddisplay(String winddisplay) {
		this.winddisplay = winddisplay;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getFeelslike() {
		return feelslike;
	}
	public void setFeelslike(String feelslike) {
		this.feelslike = feelslike;
	}
	public String getObservationpoint() {
		return observationpoint;
	}
	public void setObservationpoint(String observationpoint) {
		this.observationpoint = observationpoint;
	}
	public String getObservationtime() {
		return observationtime;
	}
	public void setObservationtime(String observationtime) {
		this.observationtime = observationtime;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSkytext() {
		return skytext;
	}
	public void setSkytext(String skytext) {
		this.skytext = skytext;
	}
	public String getSkycode() {
		return skycode;
	}
	public void setSkycode(String skycode) {
		this.skycode = skycode;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	

}
