package com.apple.mongo.demo.flagPicker.service;

import java.util.List;
import java.util.Optional;

import com.apple.mongo.demo.flagPicker.model.Country;
import com.apple.mongo.demo.flagPicker.model.FlagPicker;

public interface FlagPickerService {
	public void saveContinent(FlagPicker flagPicker) throws Exception;
	
	List<FlagPicker> listAll() throws Exception;
	
	Optional<FlagPicker> getContinent(String continent) throws Exception;
	
	List<Country> getFlag(String countryName) throws Exception;
	
}

