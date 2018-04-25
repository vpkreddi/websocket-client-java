package com.websocket.client;

import java.io.Serializable;
import java.time.ZonedDateTime;



public class ActVoilation implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Unique id of ACT voilation instance
	 */
	
	private String id;
	
	
    private String chitRefId;
	
  
    private String companyCode;
	
	
	private String actName;
	
	
	private String actDescription;
	

	private Boolean isViolated;
	
	
	private String specificDetails;
	
	
	private ZonedDateTime flaggedOn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChitRefId() {
		return chitRefId;
	}

	public void setChitRefId(String chitRefId) {
		this.chitRefId = chitRefId;
	}

	
	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public String getActDescription() {
		return actDescription;
	}

	public void setActDescription(String actDescription) {
		this.actDescription = actDescription;
	}

	public Boolean getIsViolated() {
		return isViolated;
	}

	public void setIsViolated(Boolean isViolated) {
		this.isViolated = isViolated;
	}

	public String getSpecificDetails() {
		return specificDetails;
	}

	public void setSpecificDetails(String specificDetails) {
		this.specificDetails = specificDetails;
	}

	public ZonedDateTime getFlaggedOn() {
		return flaggedOn;
	}

	public void setFlaggedOn(ZonedDateTime flaggedOn) {
		this.flaggedOn = flaggedOn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actDescription == null) ? 0 : actDescription.hashCode());
		result = prime * result + ((actName == null) ? 0 : actName.hashCode());
		result = prime * result + ((chitRefId == null) ? 0 : chitRefId.hashCode());
		result = prime * result + ((companyCode == null) ? 0 : companyCode.hashCode());
		result = prime * result + ((flaggedOn == null) ? 0 : flaggedOn.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isViolated == null) ? 0 : isViolated.hashCode());
		result = prime * result + ((specificDetails == null) ? 0 : specificDetails.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActVoilation other = (ActVoilation) obj;
		if (actDescription == null) {
			if (other.actDescription != null)
				return false;
		} else if (!actDescription.equals(other.actDescription))
			return false;
		if (actName == null) {
			if (other.actName != null)
				return false;
		} else if (!actName.equals(other.actName))
			return false;
		if (chitRefId == null) {
			if (other.chitRefId != null)
				return false;
		} else if (!chitRefId.equals(other.chitRefId))
			return false;
		if (companyCode == null) {
			if (other.companyCode != null)
				return false;
		} else if (!companyCode.equals(other.companyCode))
			return false;
		if (flaggedOn == null) {
			if (other.flaggedOn != null)
				return false;
		} else if (!flaggedOn.equals(other.flaggedOn))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isViolated == null) {
			if (other.isViolated != null)
				return false;
		} else if (!isViolated.equals(other.isViolated))
			return false;
		if (specificDetails == null) {
			if (other.specificDetails != null)
				return false;
		} else if (!specificDetails.equals(other.specificDetails))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ActVoilation [id=" + id + ", chitRefId=" + chitRefId + ", companyCode="
				+ companyCode + ", actName=" + actName + ", actDescription=" + actDescription + ", isViolated="
				+ isViolated +  ", specificDetails=" + specificDetails + ", flaggedOn="
				+ flaggedOn + "]";
	}
	
}