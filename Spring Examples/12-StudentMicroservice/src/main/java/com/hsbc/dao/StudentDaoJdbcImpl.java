package com.hsbc.dao;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Primary
public class StudentDaoJdbcImpl implements StudentDao {
    @Autowired
    private JdbcTemplate template;

    @Autowired
    private JdbcClient client;

    @Override
    public boolean createStudent(Student student) {
        String query = "Insert Into Students(student_id, student_name, student_score, dept_id) values(?, ?, ?, ?)";
        int result = client.sql(query)
                .param(student.getStudentId())
                .param(student.getStudentName())
                .param(student.getStudentScore())
                .param(student.getDept().getDeptId()).update();

        //int result = template.update(query, student.getStudentId(), student.getStudentName(), student.getStudentScore(), student.getDept().getDeptId());
        return  (result == 1) ? true : false;
    }
    @Override
    public Student readStudentById(int studentId) throws NoSuchStudentException {
        String query = "select * from students where student_id = "+studentId;
        //Student result = (Student) client.sql(query).query().singleValue();
        Student result = template.queryForObject(query, new StudentRowMapper());
        if(result == null){
            throw new NoSuchStudentException("Student "+studentId+" not found.");
        }
        return result;
    }
    @Override
    public List<Student> readAllStudents() {
        String query = "select * from students";
        List<Student> result = template.query(query, new StudentRowMapper());
        return result;
    }

    @Override
    public Student updateStudent(int studentId, Student student) {
        String query = "update students set student_name=?, student_score=? where student_id=?";
        template.update(query, student.getStudentName(), student.getStudentScore(), studentId);
        return student;
    }

    @Override
    public boolean deleteStudent(int studentId) {
        String query = "delete from students where student_id=?";
        int result = template.update(query, studentId);
        return (result==1);
    }
}
