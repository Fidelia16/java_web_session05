package com.session05.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "stundent_id", columnDefinition = "char(5)")
    private String id;
    @Column(name = "student_name", columnDefinition = "varchar(100)", nullable = false)
    private String name;
    @Column(name = "student_email", columnDefinition = "varchar(100)", nullable = false)
    private String email;
    @Column(name = "student_birthday")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    @Column(name = "student_avg_mark")
    private Float avgMark;
}
