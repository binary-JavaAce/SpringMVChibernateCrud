package springmvc2.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import springmvc2.model.Student;

@Component
public class StudentDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void addStudent(Student st) {
		hibernateTemplate.save(st);
	}

	public List<Student> getStudents() {
		return hibernateTemplate.loadAll(Student.class);
	}

	public Student getStudentById(int id) {
		return hibernateTemplate.get(Student.class, id);
	}
	@Transactional
	public void updateStudent(Student s) {
		hibernateTemplate.update(s);
	}
	@Transactional
	public void deleteStudent(int id) {
		hibernateTemplate.delete(getStudentById(id));
	}
	
}
