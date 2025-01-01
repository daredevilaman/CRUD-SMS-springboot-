package br.com.shivi.awesome.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.shivi.awesome.model.Student;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findByNameIgnoreCaseContainingOrderByNameAsc(String name);

    Student findOne(Long id);

    Object save(Student student);

    
    void delete(Long id);

    void deleteAll();
}
