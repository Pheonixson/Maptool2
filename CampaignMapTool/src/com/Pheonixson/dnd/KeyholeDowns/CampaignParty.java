package com.Pheonixson.dnd.KeyholeDowns;

public class CampaignParty {
	private CampaignLocation partyLocation;
	private String partyMembers;
	private String partyGoal;

	public CampaignParty() {
		this.partyLocation = new CampaignLocation();
		this.partyMembers = "Knights of Placeholder";
		this.partyGoal = "Not die";
	}

	/**
	 * @param partyLocation
	 * @param partyMembers
	 * @param partyGoal
	 */
	public CampaignParty(CampaignLocation partyLocation, String partyMembers, String partyGoal) {
		this.partyLocation = partyLocation;
		this.partyMembers = partyMembers;
		this.partyGoal = partyGoal;
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

	/**
	 * @return the partyGoal
	 */
	public String getPartyGoal() {
		return partyGoal;
	}

	/**
	 * @param partyGoal
	 *            the partyGoal to set
	 */
	public void setPartyGoal(String partyGoal) {
		this.partyGoal = partyGoal;
	}

}
