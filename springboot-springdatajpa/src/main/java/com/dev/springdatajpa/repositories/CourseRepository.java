package com.dev.springdatajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.springdatajpa.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,String>{
	//findByXXX() methods
    public List<Course> findByCourseDuration(String courseDuration);
    public List<Course> findByCourseFee(int courseFee);
    public List<Course> findByCourseFeeLessThanEqual(int courseFee);
    public List<Course> findByCourseFeeGreaterThanEqual(int courseFee);
    
    //Custom Queries
    @Query(value="select * from course_details",nativeQuery = true)
    public List<Course> getAllCourses();
    
    @Query("from Course")//internal it is select * from and it is HQL query
    public List<Course> getCourses();
    
    @Query(value = "select * from course_details where course_fee <= :fee", nativeQuery=true)
    List<Course> getCourseFeeLessThanEqual(int fee);
    
    @Query("from Course where courseFee >= :fee")
    List<Course> getCourseFeeGreaterThanEqual(int fee);
}
