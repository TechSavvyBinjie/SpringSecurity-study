package top.yangfan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.yangfan.entity.User;
import top.yangfan.mapper.UserMapper;
import top.yangfan.service.IUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangfan
 * @since 2024-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}