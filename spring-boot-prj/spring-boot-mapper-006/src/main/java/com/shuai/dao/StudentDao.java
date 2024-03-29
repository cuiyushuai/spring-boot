package com.shuai.dao;

import com.shuai.model.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author Admin
 * @date 2022/10/24 14:16
 */

public interface StudentDao {
  Student queryStu(@Param("stuID") Integer id);

  Integer insertStu(Student student);

}
