package magongwa.jeremia.subject.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import magongwa.jeremia.subject.model.Subject;
import magongwa.jeremia.subject.service.SubjectService;



@CrossOrigin(origins = {"http://localhost:4200"},maxAge = 4800, allowedHeaders = "*",allowCredentials = "false")
@RestController
@RequestMapping(path = "Api/Subject")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping
    public ResponseEntity<List<Subject>> findAll() {
        return ResponseEntity.ok(subjectService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Subject product) {
        return ResponseEntity.ok(subjectService.save(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> findById(@PathVariable String id) {
        Optional<Subject> subject = subjectService.findById(id);
        if (!subject.isPresent()) {
           
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(subject.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Subject> update(@PathVariable String id, @Valid @RequestBody Subject product) {
        if (!subjectService.findById(id).isPresent()) {
      
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(subjectService.save(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        if (!subjectService.findById(id).isPresent()) {
          
            ResponseEntity.badRequest().build();
        }

        subjectService.deleteById(id);

        return ResponseEntity.ok().build();
    }
	

}