package com.example.card.service;

import com.example.card.entity.CardType;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caichunyi
 * @since 2017-03-13
 */
public interface CardTypeService extends IService<CardType> {

    Map<String, Integer> getNameIdMap();
}
