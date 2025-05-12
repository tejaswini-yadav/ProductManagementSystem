package com.yash.pms.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	/**
	 * Default serial version ID
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @JsonProperty
    private String name;

    @Column(name = "age")
    @JsonProperty
    private Integer age;

    @Column(name = "address")
    @JsonProperty
    private String address;
    
    @ManyToMany
    @JoinTable(name = "student_subject", joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"))
    @JsonProperty
    private List<Subject> subject;

	public Student(Integer id, String name, Integer age, String address,List<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address+", subject="+subject
				+ "]";
	}
    
}
