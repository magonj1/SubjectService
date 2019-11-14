package magongwa.jeremia.subject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import magongwa.jeremia.subject.model.Subject;
import magongwa.jeremia.subject.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    public Optional<Subject> findById(String id) {
        return subjectRepository.findById(id);
    }

    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    public void deleteById(String id) {
    	subjectRepository.deleteById(id);
    }
}
