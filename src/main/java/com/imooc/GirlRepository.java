package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by heitizi on 2017/3/28.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄查找
    public List<Girl> findByAge(Integer age);
}