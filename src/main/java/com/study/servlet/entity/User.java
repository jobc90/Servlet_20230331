package com.study.servlet.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
	private int userId;
	private String username;
	private String password;
	private String name;
	private String email;

}
