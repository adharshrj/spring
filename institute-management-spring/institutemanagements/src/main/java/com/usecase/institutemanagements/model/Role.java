package com.usecase.institutemanagements.model;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ARole name;

	public Role() {

	}

	public Role(ARole name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ARole getName() {
		return name;
	}

	public void setName(ARole name) {
		this.name = name;
	}
}