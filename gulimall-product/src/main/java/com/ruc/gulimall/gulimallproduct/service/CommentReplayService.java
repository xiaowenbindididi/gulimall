package com.ruc.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruc.common.utils.PageUtils;
import com.ruc.gulimall.gulimallproduct.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author xiaowenbin
 * @email 1169215228@qq.com
 * @date 2022-03-15 15:53:17
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

