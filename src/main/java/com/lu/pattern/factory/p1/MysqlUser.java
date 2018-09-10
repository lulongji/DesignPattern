package com.lu.pattern.factory.p1;

import com.lu.pattern.Common.Domain.User;

/**
 * @Description:
 * @Author: lulongji
 */
public class MysqlUser {

    public void insert(User user) {
        System.out.println("对 MySQL 里的 User 表插入了一条数据");
    }

    public User getUser(int uid) {
        System.out.println("通过 uid 在 MySQL 里的 User 表得到了一条数据");
        return null;
    }


}
