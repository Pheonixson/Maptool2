package com.Pheonixson.dnd.KeyholeDowns;

import java.util.HashMap;
import java.util.Map;

public class CampaignMap {
	
	private Map<Integer, String> cm = new HashMap<Integer, String>();
	
	public void put(int coordinate, String locationName) {
		Integer I = coordinate;
		cm.put(I, locationName);
	}
	
	public String get(int coordinate)
	{
		Integer c = coordinate;
		return cm.get(c);
	}
	

}
