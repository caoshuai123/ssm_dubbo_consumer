package com.css.dubbo.service;

import com.css.dubbo.entity.Student;
import com.github.pagehelper.PageInfo;

public interface StudentService {
	
	PageInfo<Student> list(Integer pageNum,Integer pagesize);
	

}
