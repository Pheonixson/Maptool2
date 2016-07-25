package com.Pheonixson.dnd.KeyholeDowns;

import java.util.HashMap;
import java.util.Map;

public class CampaignMap {

	private Map<Integer, CampaignLocation> cm;
	private Map<String, CampaignLocation> cmStringMap;
	private CampaignParty campaignParty;

	public CampaignMap() {
		this.cm = new HashMap<Integer, CampaignLocation>();
		this.cmStringMap = new HashMap<String, CampaignLocation>();
		this.campaignParty = new CampaignParty();
	}

	/**
	 * @param cm
	 * @param cmStringMap
	 * @param camppaignParty
	 */
	public CampaignMap(Map<Integer, CampaignLocation> cm, Map<String, CampaignLocation> cmStringMap,
			CampaignParty campaignParty) {
		this.cm = cm;
		this.cmStringMap = cmStringMap;
		this.campaignParty = campaignParty;
	}

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

	public CampaignLocation get(int coordinate) {
		Integer c = coordinate;
		return cm.get(c);
	}

	public CampaignLocation get(String locationName) {
		return cmStringMap.get(locationName);
	}

}
