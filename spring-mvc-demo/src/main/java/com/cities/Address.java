package com.cities;

import java.util.List;

public class Address {
	private City city;
	private List<City> bigCities;
	private City aBigCity;
	private List<String> cityNames;
	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
	/**
	 * @return the bigCities
	 */
	public List<City> getBigCities() {
		return bigCities;
	}
	/**
	 * @param bigCities the bigCities to set
	 */
	public void setBigCities(List<City> bigCities) {
		this.bigCities = bigCities;
	}
	/**
	 * @return the aBigCity
	 */
	public City getaBigCity() {
		return aBigCity;
	}
	/**
	 * @param aBigCity the aBigCity to set
	 */
	public void setaBigCity(City aBigCity) {
		this.aBigCity = aBigCity;
	}
	/**
	 * @return the cityNames
	 */
	public List<String> getCityNames() {
		return cityNames;
	}
	/**
	 * @param cityNames the cityNames to set
	 */
	public void setCityNames(List<String> cityNames) {
		this.cityNames = cityNames;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [city=" + city + ", bigCities=" + bigCities
				+ ", aBigCity=" + aBigCity + ", cityNames=" + cityNames + "]";
	}
	
}
