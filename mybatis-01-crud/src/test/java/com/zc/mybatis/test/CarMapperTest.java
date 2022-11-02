package com.zc.mybatis.test;

import com.zc.mybatis.pojo.Car;
import com.zc.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CarMapperTest {

    @Test
    public void testInsertCar(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        sqlSession.insert("insertCar");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateCar() {
        Car car = new Car(5L, "1001", "奥迪", 30.0, "2001-09-22", "新能源");
        SqlSession sqlSession = SqlSessionUtil.openSession();
        sqlSession.update("updateCar", car);
        sqlSession.commit();
        sqlSession.close();
    }
}
