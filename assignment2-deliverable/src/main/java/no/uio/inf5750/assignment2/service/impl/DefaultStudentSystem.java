package no.uio.inf5750.assignment2.service.impl;

import java.util.Collection;

import no.uio.inf5750.assignment2.model.Course;
import no.uio.inf5750.assignment2.model.Degree;
import no.uio.inf5750.assignment2.model.Student;
import no.uio.inf5750.assignment2.service.StudentSystem;

public class DefaultStudentSystem implements StudentSystem {

	@Override
	public int addCourse(String courseCode, String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateCourse(int courseId, String courseCode, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseByCourseCode(String courseCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delCourse(int courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAttendantToCourse(int courseId, int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAttendantFromCourse(int courseId, int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addDegree(String type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateDegree(int degreeId, String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Degree getDegree(int degreeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Degree getDegreeByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Degree> getAllDegrees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delDegree(int degreeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRequiredCourseToDegree(int degreeId, int courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRequiredCourseFromDegree(int degreeId, int courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addStudent(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateStudent(int studentId, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delStudent(int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDegreeToStudent(int studentId, int degreeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDegreeFromStudent(int studentId, int degreeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean studentFulfillsDegreeRequirements(int studentId, int degreeId) {
		// TODO Auto-generated method stub
		return false;
	}

}
