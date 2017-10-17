package com.example.springbootjokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	
	private ChuckNorrisQuotes quotes;
	
	public JokeServiceImpl() {
		quotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}
}
