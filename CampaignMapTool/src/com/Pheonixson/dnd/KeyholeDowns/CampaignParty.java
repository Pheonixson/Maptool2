package com.Pheonixson.dnd.KeyholeDowns;

public class CampaignParty {
	private CampaignLocation partyLocation;
	private String partyMembers;

	public CampaignParty() {
		this.partyLocation = new CampaignLocation();
		this.partyMembers = "Knights of Placeholder";
	}

	/**
	 * @param partyLocation
	 * @param partyMembers
	 */
	public CampaignParty(CampaignLocation partyLocation, String partyMembers) {
		this.partyLocation = partyLocation;
		this.partyMembers = partyMembers;
	}

	/**
	 * @return the partyLocation
	 */
	public CampaignLocation getPartyLocation() {
		return partyLocation;
	}

	/**
	 * @param partyLocation
	 *            the partyLocation to set
	 */
	public void setPartyLocation(CampaignLocation partyLocation) {
		this.partyLocation = partyLocation;
	}

	/**
	 * @return the partyMembers
	 */
	public String getPartyMembers() {
		return partyMembers;
	}

	/**
	 * @param partyMembers
	 *            the partyMembers to set
	 */
	public void setPartyMembers(String partyMembers) {
		this.partyMembers = partyMembers;
	}

}
