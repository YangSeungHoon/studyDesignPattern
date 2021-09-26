package factoryPattern.domain.userInfo.dao.mysql;

import factoryPattern.domain.userInfo.UserInfo;
import factoryPattern.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("UserInfo MySql");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UserInfo MySql");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("UserInfo MySql");
    }
}
