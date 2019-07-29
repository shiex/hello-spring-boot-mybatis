package com.yxvk.hello.spring.boot.mybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxvk.hello.spring.boot.mybatis.entity.Book;
import com.yxvk.hello.spring.boot.mybatis.entity.User;
import com.yxvk.hello.spring.boot.mybatis.mapper.BookMapper;
import com.yxvk.hello.spring.boot.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringBootMybatisApplication.class)
@Transactional
@Rollback
public class HelloSpringBootMybatisApplicationTests {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelect() {
        List<User> users = userMapper.selectAll();
        for (User u :users){
            System.out.println(u.getUsername());
        }
    }

    /**
     * 测试分页查询
     */
    @Test
    public void testPage() {
        // PageHelper 使用非常简单，只需要设置页码和每页显示笔数即可
        PageHelper.startPage(0, 10);

        // 设置分页查询条件
        Example example = new Example(Book.class);
        PageInfo<Book> pageInfo = new PageInfo<>(bookMapper.selectByExample(example));

        // 获取查询结果
        List<Book> books = pageInfo.getList();
        for (Book book : books) {
            System.out.println(book.getBookname());
        }
    }

}
