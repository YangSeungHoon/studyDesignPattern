package factoryPattern.factory;

import factoryPattern.domain.product.dao.ProductDao;
import factoryPattern.domain.product.dao.mysql.ProductMySqlDao;
import factoryPattern.domain.userInfo.dao.UserInfoDao;
import factoryPattern.domain.userInfo.dao.mysql.UserInfoMySqlDao;

public class MysqlDaoFactory implements DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
