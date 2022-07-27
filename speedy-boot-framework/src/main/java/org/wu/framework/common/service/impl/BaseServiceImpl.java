package org.wu.framework.common.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.wu.framework.common.query.Query;
import org.wu.framework.common.service.BaseService;

/**
 * 基础服务类实现
 * @Author Wu Zihan
 * @Date 2022-07-27 17:55
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

    /**
     * 获取分页对象
     * @param query   分页参数
     */
    protected IPage<T> getPage(Query query){

    }
}
