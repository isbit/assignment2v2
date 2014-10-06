package no.uio.inf5750.assignment2.dao.hibernate;

import java.util.Collection;

import no.uio.inf5750.assignment2.dao.CourseDAO;
import no.uio.inf5750.assignment2.model.Course;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateCourseDao implements CourseDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
    public SessionFactory getSessionFactory() {
    	return sessionFactory;
    }
	
	public void setSessionFactory( SessionFactory sessionFactory )
    {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public int saveCourse(Course course) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Course getCourse(int id) {
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
	public void delCourse(Course course) {
		// TODO Auto-generated method stub
		
	}
	
}
