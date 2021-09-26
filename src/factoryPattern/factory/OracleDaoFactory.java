package factoryPattern.factory;

import factoryPattern.domain.product.dao.ProductDao;
import factoryPattern.domain.product.dao.oracle.ProductOracleDao;
import factoryPattern.domain.userInfo.dao.UserInfoDao;
import factoryPattern.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory implements  DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
