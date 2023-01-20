package com.himanshu.eCommerce.model;

import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
	
	@Id
	private long id;
	@NotNull
	private String name;

}
