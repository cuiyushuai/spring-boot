package com.shuai.service.impl;

import com.shuai.dao.StudentDao;
import com.shuai.model.Student;
import com.shuai.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

  /**
   * ★
   * @TransactionaL:表示方法的有事务支持 ★
   * 默认:使用库的隔离级别，REQUIRED 传播行为;超时时间 - 1
   * 抛出运行时异常，回滚事务
   */
  @Transactional
  @Override
  public Integer insertStu(Student student) {
    Integer integer = studentDao.insertStu(student);
    //    int a = 10 / 0;
    return integer;

  }
}
