package com.school.repository;

import com.school.dataobject.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    public List<Teacher> findByteacherAccount(String teacherAccount);
}
