package com.apple.mongo.demo.flagPicker.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apple.mongo.demo.flagPicker.model.Country;
import com.apple.mongo.demo.flagPicker.model.FlagPicker;
import com.apple.mongo.demo.flagPicker.service.FlagPickerService;

@RestController
@RequestMapping(value = "/flagPickers/api")
public class FlagPickerController {

	@Autowired
	FlagPickerService flagPickerService;
	
	
	@GetMapping("/continents")
	public List<FlagPicker> getFlagPickers() throws Exception {
		return flagPickerService.listAll();
	}
	@GetMapping("/continent/{continent}")
	public Optional<FlagPicker> getContinent(@PathVariable String continent) throws Exception {
		return flagPickerService.getContinent(continent);
	}
	
	  @GetMapping("/country/{name}") 
	  public List<Country> getFlagByCountryName(@PathVariable String name) throws Exception { 
		  return flagPickerService.getFlag(name);
	  }
	 


}
