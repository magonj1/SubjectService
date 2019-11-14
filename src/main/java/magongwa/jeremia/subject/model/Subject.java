package magongwa.jeremia.subject.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Subject")
public class Subject {

	@Id
	private String subjectId;
	private String title;
	
	public String getSubject_id() {
		return subjectId;
	}
	public void setSubject_id(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Subject [subject_id=" + subjectId + ", title=" + title + "]";
	}
	public Subject(String title) {
		super();
		this.title = title;
	}
	
	
	
	
}
