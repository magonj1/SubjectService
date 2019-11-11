package magongwa.jeremia.subject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import magongwa.jeremia.subject.model.Subject;
import magongwa.jeremia.subject.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	public Subject create(String title)
	{
		return subjectRepository.save(new Subject(title));
	}
	public List<Subject> getAll()
	{
		return subjectRepository.findAll();
	}
	
	public Subject getByTitle(String title)
	{
		return subjectRepository.findByTitle(title);
	}
	
	public Subject update(String title)
	{
		Subject subject = subjectRepository.findByTitle(title);
		subject.setTitle(title);
		
		return subjectRepository.save(subject);
	}
	public void deleteAll()
	{
		subjectRepository.deleteAll();
	}
	public void delete(String title)
	{
		Subject subject = subjectRepository.findByTitle(title);
		subjectRepository.delete(subject);
	}
}
