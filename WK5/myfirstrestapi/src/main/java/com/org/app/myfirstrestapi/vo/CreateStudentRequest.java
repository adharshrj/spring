package com.org.app.myfirstrestapi.vo;

import com.org.app.myfirstrestapi.entity.Student;

public class CreateStudentRequest extends BaseVo{
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    
}
