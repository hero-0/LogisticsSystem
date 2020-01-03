package com.entor.service.impl;

import com.entor.entity.Stock;
import com.entor.mapper.StockMapper;
import com.entor.service.IStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fzg
 * @since 2020-01-03
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements IStockService {

}
