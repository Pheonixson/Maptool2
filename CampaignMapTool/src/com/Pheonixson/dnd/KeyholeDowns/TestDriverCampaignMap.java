package com.Pheonixson.dnd.KeyholeDowns;

public class TestDriverCampaignMap {

	public static void main(String[] args) {
		CampaignMap cm = new CampaignMap();
		cm.put(5050, "Home Base");
		System.out.println(cm.get(5050));
	}

}
