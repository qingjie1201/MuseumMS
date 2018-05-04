package com.demo.app.dao.mapper;

import com.demo.app.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserMapper extends SqlSessionDaoSupport {

    public List<User> queryById(@Param("id") Integer uid){

        return this.getSqlSession().selectList("queryUserById",uid);
    }

    public void test1() {
    }

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

}
