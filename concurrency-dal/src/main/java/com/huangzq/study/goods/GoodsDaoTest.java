package com.huangzq.study.goods;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by demon on 2017/6/11.
 */
public class GoodsDaoTest {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        SqlSession session = sqlSessionFactory.openSession();

        try {

            GoodsDao goodsDao = session.getMapper(GoodsDao.class);

            int goodsId = 1;

            //根据相同的id查询出商品信息，赋给2个对象
            Goods goods1 = goodsDao.getGoodsById(goodsId);
            Goods goods2 = goodsDao.getGoodsById(goodsId);

            //打印当前商品信息
            System.out.println(goods1);
            System.out.println(goods2);

            //更新goods1信息1
            goods1.setStock(8);//购买8个goods1
            int updateResult1 = goodsDao.updateGoods(goods1);
            session.commit();
            System.out.println("修改商品信息1" + (updateResult1 == 1 ? "成功" : "失败"));

            //更新goods2信息2
            goods1.setStock(5);//购买5个goods1
            int updateResult2 = goodsDao.updateGoods(goods1);
            session.commit();
            System.out.println("修改商品信息2" + (updateResult2 == 1 ? "成功" : "失败"));

        } finally {
            session.close();
        }
    }
}
