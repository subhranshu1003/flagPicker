package com.apple.mongo.demo.flagPicker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apple.mongo.demo.flagPicker.model.Country;
import com.apple.mongo.demo.flagPicker.model.FlagPicker;
import com.apple.mongo.demo.flagPicker.repository.FlagPickerRepository;

@Service
public class FlagPickerServiceImpl implements FlagPickerService {
	
	
	@Autowired
	private FlagPickerRepository flagPickerRepository;
	
	
	
	@Override
	public List<FlagPicker> listAll() throws Exception {
		List<FlagPicker> flagPickers = new ArrayList<>();
		flagPickers = flagPickerRepository.findAll();
		return flagPickers;
	}

	@Override
	public Optional<FlagPicker> getContinent(String continent) throws Exception {
		return flagPickerRepository.findByContinent(continent);
	}
	
	
	  @Override
	  public List<Country> getFlag(String countryName) throws Exception {
		  Optional<FlagPicker> flagPicker= flagPickerRepository.findByCountryName(countryName);
		  return flagPicker.get().getCountries();
	  }
	  
	 
	 
	
}
