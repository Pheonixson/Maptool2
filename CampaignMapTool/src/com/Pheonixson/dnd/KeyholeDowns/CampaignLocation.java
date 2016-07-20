package com.Pheonixson.dnd.KeyholeDowns;

public class CampaignLocation {
	private String locationName;
	private String locationDescription;
	
	public CampaignLocation() {}

	/**
	 * @param locationName
	 * @param locationDescription
	 */
	public CampaignLocation(String locationName, String locationDescription) {
		this.locationName = locationName;
		this.locationDescription = locationDescription;
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * @return the locationDescription
	 */
	public String getLocationDescription() {
		return locationDescription;
	}

	/**
	 * @param locationDescription the locationDescription to set
	 */
	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return locationName + ": " + locationDescription;
	}
	
	

}
