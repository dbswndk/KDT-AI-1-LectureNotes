package com.example.demo.lectureClass.testCode.student.service;

import com.example.demo.lectureClass.testCode.student.entity.TestStudent;
import com.example.demo.lectureClass.testCode.student.repository.TestStudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestStudentServiceImpl implements TestStudentService{
    final private TestStudentRepository studentRepository;

    @Override
    public TestStudent register(TestStudent testStudent) {
        final Optional<TestStudent> maaybeStudent =
                studentRepository.findByName(testStudent.getName());
        if(maaybeStudent.isPresent()){
            log.info("동일 닉네임의 학생이름이 존재합니다.");
            return null;
        }
        return studentRepository.save(testStudent);
    }
}
