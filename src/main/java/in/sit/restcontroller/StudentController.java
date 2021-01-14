package in.sit.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sit.entity.StudentEntity;

@RestController
@RequestMapping("/student/data")
@CrossOrigin(origins = "https://sk2m.herokuapp.com")
//@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	private final List<StudentEntity> list = new ArrayList<>();
   
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody StudentEntity e) {
		     list.add(e);
		return ResponseEntity.ok("your Data saved succesfully");
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<StudentEntity>> getAllStudent(){
		return ResponseEntity.ok(list);
		
	}
}
