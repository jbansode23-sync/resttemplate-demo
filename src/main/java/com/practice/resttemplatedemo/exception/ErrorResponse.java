package com.practice.resttemplatedemo.exception;

import lombok.Data;

@Data
public class ErrorResponse {

	private int code;
	private String description;
}
