package com.domain.redis;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConfigTest {

//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @Resource
//    private ValueOperations<String,Object> valueOperations;
//
//    @Autowired
//    private HashOperations<String, String, Object> hashOperations;
//
//    @Autowired
//    private ListOperations<String, Object> listOperations;
//
//    @Autowired
//    private SetOperations<String, Object> setOperations;
//
//    @Autowired
//    private ZSetOperations<String, Object> zSetOperations;
//
//    @Resource
//    private RedisService redisService;
//
//    @Test
//    public void testObj() throws Exception{
//        UserVo userVo = new UserVo();
//        userVo.setAddress("上海");
//        userVo.setName("测试dfas");
//        userVo.setAge(123);
//        ValueOperations<String,Object> operations = redisTemplate.opsForValue();
//        redisService.expireKey("name",20, TimeUnit.SECONDS);
//        String key = RedisKeyUtil.getKey(UserVo.Table,"name",userVo.getName());
//        UserVo vo = (UserVo) operations.get(key);
//        System.out.println(vo);
//    }

}
