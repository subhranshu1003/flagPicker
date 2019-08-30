package com.apple.mongo.demo.flagPicker.repository;


import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.apple.mongo.demo.flagPicker.model.FlagPicker;

@Repository
public interface FlagPickerRepository extends MongoRepository<FlagPicker, String> {
	
	Optional<FlagPicker> findByContinent(String continent);
	
	@Query(value="{'countries.name': ?0 }",fields="{'countries.name.$':1}")
	Optional<FlagPicker> findByCountryName(@Param(value = "name") String name); 
}
