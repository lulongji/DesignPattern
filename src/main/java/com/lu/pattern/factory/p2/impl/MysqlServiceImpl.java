package com.lu.pattern.factory.p2.impl;

import com.lu.pattern.Common.Domain.User;
import com.lu.pattern.factory.p2.UserService;

/**
 * @Description:
 * @Author: lulongji
 */
public class MysqlServiceImpl implements UserService {

    public void insert(User user) {

        System.out.println("对 MySQL 里的 User 表插入了一条数据");
    }

    public User getUser(int uid) {
        System.out.println("通过 uid 在 MySQL 里的 User 表得到了一条数据");
        return null;
    }
}
