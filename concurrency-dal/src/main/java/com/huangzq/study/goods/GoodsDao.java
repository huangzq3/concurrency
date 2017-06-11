package com.huangzq.study.goods;

/**
 * Created by demon on 2017/6/11.
 */
public interface GoodsDao {

    Goods getGoodsById(Integer goodsId);

    int updateGoods(Goods goods);
}
