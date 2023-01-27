package com.ankhang.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Info")
public class Info {
	@Id
	@Column(name = "infoid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long infoId;
	
	@Column(name = "infophone")
	private String infoPhone;
	
	@Column(name = "infoage")
	private String infoAge;
}
