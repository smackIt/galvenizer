package com.gre.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.gre.entities.Word;

@Component
public class WordDao {
	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	public Word getWord(String wordString){
		String query = "SELECT * FROM wordTable where word = \""+wordString+"\"";
		Word word = jdbcTemplate.queryForObject(query, Word.class);
		return word;
	}
	
	public Word addWord(Word word){
		String query = "INSERT INTO wordTable (word,meaning,example) VALUES (?,?,?)";
		jdbcTemplate.update(query,word.getWord(),word.getMeaning(),word.getExample());
		return word;
	}
	
}
