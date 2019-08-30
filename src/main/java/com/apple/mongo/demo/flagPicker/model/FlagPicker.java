package com.apple.mongo.demo.flagPicker.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "continents")
public class FlagPicker {

	@Id
	private ObjectId _id;
	private String continent;
	private List<Country> countries;

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "FlagPicker [_id=" + _id + ", continent=" + continent + ", countries=" + countries + "]";
	}

}
