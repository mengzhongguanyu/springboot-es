package com.mzgy.springbootes.repository;

import com.mzgy.springbootes.model.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author dongzh
 * @date 2021年04月01日 15:41
 * @function
 */
@SpringBootTest
public class UserInfoRepositoryTest{
    @Autowired
    UserInfoRepository userInfoRepository;

    @Test
    public void save() {
        UserInfo userInfo = new UserInfo(2L, "中梦观雨", 21, "第二条测试数据");
        UserInfo userInfo1 = userInfoRepository.save(userInfo);
        System.out.println(userInfo1);
    }


    @Test
    public void findTest() {
        Pageable pageable = PageRequest.of(0, 10);
        Page<UserInfo> page = userInfoRepository.findByName("李", pageable);
        System.out.println(page);
        List<UserInfo> content = page.getContent();
        System.out.println(content);
//        List<UserInfo> name = userInfoRepository.findByName("李");
//        System.out.println(name);
    }

}
