package com.hasindu.dahanayake;

public class Address {

	private String country;
	private String city;
	private String district;
	private String addressValue;

	public Address() {
		super();

	}

	public Address(String country, String city, String district, String addressValue) {
		super();
		this.country = country;
		this.city = city;
		this.district = district;
		this.addressValue = addressValue;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDisctrict(String district) {
		this.district = district;
	}

	public String getAdressValue() {
		return addressValue;
	}

	public void setAdressValue(String addressValue) {
		this.addressValue = addressValue;
	}

	/**
	 * Cloned method implementation
	 */
	@Override
	protected Object clone() {
		try {
			return (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			return new Address(this.getCountry(), this.getCity(), this.getDistrict(), this.getAdressValue());
		}
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", disctrict=" + district + ", addressValue="
				+ addressValue + "]";
	}

}
