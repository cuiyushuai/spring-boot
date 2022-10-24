package com.shuai.service;

import com.shuai.model.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author Admin
 * @date 2022/10/24 14:22
 */

public interface StudentService {
  Student queryStu(@Param("stuID") Integer id);

  Integer insertStu(Student student);
}
