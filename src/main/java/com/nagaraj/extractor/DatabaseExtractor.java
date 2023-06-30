package com.nagaraj.extractor;

import java.util.List;

import com.nagaraj.config.Configuration;
import com.nagaraj.entities.Entity;

public abstract class DatabaseExtractor {
	
	private Configuration configuration;
	
	public DatabaseExtractor(Configuration configuration){
		this.configuration	= configuration;
	}
	
	public abstract List<Entity> getEntities(String schemaName) throws Exception;
	
	public Configuration getConfiguration(){
		return configuration;
	}

}
