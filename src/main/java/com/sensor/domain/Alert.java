package com.sensor.domain;
import org.mongodb.morphia.annotations.Entity;

/**
 * This is Alert domain or pojo class, 
 * which captures or holds the alert information.
 */
@Entity
public class Alert extends SensorDomain {
	
	private String indicator;
	
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Alert[id=%s, value='%s', baseWeight='%s', indicator='%s', timeStamp='%s']",
                getId(), getValue(), getBaseWeight(), this.indicator, getTimeStamp());
    }
	
}
