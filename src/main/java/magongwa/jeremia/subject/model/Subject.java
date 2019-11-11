package magongwa.jeremia.subject.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Subject")
public class Subject {

	@Id
	private ObjectId subject_id;
	private String title;
	
	public ObjectId getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(ObjectId subject_id) {
		this.subject_id = subject_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Subject [subject_id=" + subject_id + ", title=" + title + "]";
	}
	public Subject(String title) {
		super();
		this.title = title;
	}
	
	
	
	
}
