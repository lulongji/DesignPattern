package com.lu.pattern.factory.p2;

import com.lu.pattern.Common.Domain.User;

/**
 * @Description:
 * @Author: lulongji
 */
public interface UserService {

    void insert(User user);

    User getUser(int uid);
}
