package com.nagaraj.render;

import com.nagaraj.config.Configuration;
import com.nagaraj.entities.Entity;

/**
 * 
 * @author ನಾಗರಾಜ್ ಖಾರ್ವಿ
 *
 */
public abstract class BaseClassRender {

	private Entity			entity;
	private Configuration	configuration;
	
	public	BaseClassRender(Entity entity, Configuration configuration){
		this.entity			= entity;
		this.configuration	=	configuration;
	}
	
	public Entity getEntity(){
		return entity;
	}
	
	public Configuration getConfiguration(){
		return configuration;
	}
	
	public abstract String render() throws Exception;

}
