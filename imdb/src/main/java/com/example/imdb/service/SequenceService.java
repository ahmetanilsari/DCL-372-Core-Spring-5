package com.example.imdb.service;

public interface SequenceService {
	long nextId(String sequenceName);

	long nextId(String sequenceName, int step);

	String nextId(String sequenceName, String prefix);

	String nextId(String sequenceName, String prefix, int step);
}
