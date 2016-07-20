package com.Pheonixson.dnd.KeyholeDowns;

import java.util.HashMap;
import java.util.Map;

public class CampaignMap {
	
	private Map<Integer, CampaignLocation> cm = new HashMap<Integer, CampaignLocation>();
	private Map<String, CampaignLocation> cmStringMap = new HashMap<String, CampaignLocation>();
	
	public void put(int coordinate, CampaignLocation campaignLocation) {
		Integer I = coordinate;
		cm.put(I, campaignLocation);
		String locationName = campaignLocation.getLocationName();
		cmStringMap.put(locationName, campaignLocation);
	}
	
	public void put(int coordinate, String locationName) {
		CampaignLocation campaignLocation = new CampaignLocation();
		campaignLocation.setLocationName(locationName);
		this.put(coordinate, campaignLocation);
	}
	
	public CampaignLocation get(int coordinate)
	{
		Integer c = coordinate;
		return cm.get(c);
	}
	
	public CampaignLocation get(String campaignName)
	{
		return cmStringMap.get(campaignName);
	}
	

}
