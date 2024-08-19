package com.hsbc.dao;

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
                .param(student.getDept().getDeptId())
                .update();
               return  (result == 1) ? true : false;
    }
    @Override
    public Student readStudentById(int studentId) {
        String query = "select * from students where student_id = "+studentId;
        Student result =  client.sql(query)
                                .param(studentId)
                                .query(new StudentRowMapper())
                                .single();
        return result;
    }
    @Override
    public List<Student> readAllStudents() {
        String query = "select * from students";
        List<Student> result = client.sql(query)
                                    .query(new StudentRowMapper())
                                    .list();
        return result;
    }

    @Override
    public Student updateStudent(int studentId, Student student) {
        String query = "update students set student_name=?, student_score=? where student_id=?";
        client.sql(query)
                .param(student.getStudentName())
                        .param(student.getStudentScore())
                                .param(studentId)
                                        .update();
        return student;
    }

    @Override
    public boolean deleteStudent(int studentId) {
        String query = "delete from students where student_id=?";
        int result = client.sql(query)
                .param(studentId)
                .update();
//        int result = template.update(query, studentId);
        return (result==1);
    }
}
