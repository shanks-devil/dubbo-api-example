package com.github.shanks.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Demo implements Serializable {

	private static final long serialVersionUID = 1890464547136412778L;

	private String title;

	private Date time;

}
