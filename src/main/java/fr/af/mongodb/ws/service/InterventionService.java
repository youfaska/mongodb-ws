package fr.af.mongodb.ws.service;

import java.util.List;

import com.mongodb.DBObject;

import fr.af.mondodb.ws.model.Actividad;

/**
 * The Interface InterventionService.
 */
public interface InterventionService {
	 
 	/**
 	 * Gets the all interventions.
 	 *
 	 * @return the all interventions
 	 */
 	List<Actividad>  getAllActivities ();

 	/**
 	 * Add new element.
 	 * @param dbObject
 	 */
 	void insertObject(DBObject dbObject );
}
