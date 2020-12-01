package com.hllinventory.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="inv_docment_master")
public class DocumentMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int docid;
	private String docname;
	@Column(name="doc_delete_flag")
	private  int docDeleteFlag;
	
	@Column(name="doc_update_date")
	private Date docUpdateDate;

	@Column(name = "doc_add_date")
	private Date documentAddDate;


}