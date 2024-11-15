package top.yangfan.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.yangfan.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yangfan
 * @since 2024-11-13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
