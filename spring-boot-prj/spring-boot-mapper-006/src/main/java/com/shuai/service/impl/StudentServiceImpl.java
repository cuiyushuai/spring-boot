package com.shuai.service.impl;

import com.shuai.dao.StudentDao;
import com.shuai.model.Student;
import com.shuai.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Admin
 * @date 2022/10/24 14:22
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Resource
  private StudentDao studentDao;

  @Override
  public Student queryStu(Integer id) {
    return studentDao.queryStu(id);
  }
}
