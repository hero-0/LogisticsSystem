package com.entor.service.impl;

import com.entor.entity.Staff;
import com.entor.mapper.StaffMapper;
import com.entor.service.IStaffService;
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
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

}
