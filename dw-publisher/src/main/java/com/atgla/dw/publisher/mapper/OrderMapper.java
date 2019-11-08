package com.atgla.dw.publisher.mapper;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
    //查询当日交易总额
    public Double selectOrderAmount(String date);

    //查询当日交易额分时明细
    public List<Map> selectOrderAmountHourMap(String  date);




}
