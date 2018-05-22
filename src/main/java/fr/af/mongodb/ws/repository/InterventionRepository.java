package fr.af.mongodb.ws.repository;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;


/**
 * The Interface InterventionRepository.
 * @author youssef.oufaska
 */
public interface InterventionRepository {
	
	/**
	 * Find all interventions.
	 *
	 * @return the Collection<DBObject>
	 */
	DBCursor findAllInterventions();
	
	void insertObject(DBObject dbObject );
}
