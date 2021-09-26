package factoryPattern.domain.userInfo.dao.oracle;

import factoryPattern.domain.userInfo.UserInfo;
import factoryPattern.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("UserInfo Oracle");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UserInfo Oracle");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("UserInfo Oracle");
    }
}
