package com.apple.mongo.demo.flagPicker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.apple.mongo.demo.flagPicker.model.Country;
import com.apple.mongo.demo.flagPicker.model.FlagPicker;
import com.apple.mongo.demo.flagPicker.service.FlagPickerService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FlagPickerApplicationTests {
	
	@Autowired
	private FlagPickerService flagPickerService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testGetFlagPickers() throws Exception {
		List<FlagPicker> flagPickers = flagPickerService.listAll();
		assertNotNull(flagPickers);
		assertEquals("Africa",flagPickers.get(0).getContinent());
	}
	
	@Test
	public void testGetContinent() throws Exception {
		String continent="Africa";
		Optional<FlagPicker> flagPicker = flagPickerService.getContinent(continent);
		assertNotNull(flagPicker);
		assertEquals("Africa" ,flagPicker.get().getContinent());
	}
	
	
	  @Test 
	  public void testGetFlagByCountryName() throws Exception{ 
	  String countryName="India";
	  List<Country> country = flagPickerService.getFlag(countryName);
	  assertNotNull(country);
	  assertEquals("India",country.get(0).getName().toString());
	  
	  }
	 


}
