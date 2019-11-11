package magongwa.jeremia.subject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import magongwa.jeremia.subject.model.Subject;

import org.bson.types.ObjectId;

@Repository
public interface SubjectRepository  extends MongoRepository<Subject, ObjectId>{
		

	public Subject findByTitle(String name);	
	
}

