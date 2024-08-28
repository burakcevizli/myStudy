package com.burakcev.example.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentMapperTest {

    private StudentMapper mapper ;

    @BeforeEach
    void setUp() {
        mapper = new StudentMapper();
    }

    @Test
    public void shouldMapStudentDtoToStudent(){
        StudentDto dto = new StudentDto("Burak","Cevizli","burakcevizli@gmail.com",1);

        Student student = mapper.toStudent(dto);

        assertEquals(dto.firstname(),student.getFirstname());
        assertEquals(dto.lastname(),student.getLastname());
        assertEquals(dto.email(),student.getEmail());
        assertNotNull(student.getSchool());
    }

    public void shouldMapStudentToStudentResponseDto(){
        Student student = new Student("Burak","Cevizli","a@gmail.com",20);

        StudentResponseDto studentResponseDto = mapper.toStudentResponseDto(student);

        assertEquals(studentResponseDto.firstname(),student.getFirstname());

    }
}