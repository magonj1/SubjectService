package magongwa.jeremia.subject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import magongwa.jeremia.subject.model.Subject;
import magongwa.jeremia.subject.service.SubjectService;



@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/create")
	public String Create(@RequestParam String title)
	{
		Subject subject  = subjectService.create(title);
	
		return subject.toString();
	}
	@RequestMapping("/getAll")
	public List<Subject> getSubject()
	{
		return subjectService.getAll();
	}
	@RequestMapping("/get")
	public Subject getSubject(@RequestParam String title)
	{
		return subjectService.getByTitle(title);
	}
	@RequestMapping("/update")
	public String update(@RequestParam String title)
	{
		return subjectService.update(title).toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String title)
	{
		subjectService.delete(title);
		return "Deleted "+title;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		subjectService.deleteAll();
		return "Deleted all the Records";
	}
	

}