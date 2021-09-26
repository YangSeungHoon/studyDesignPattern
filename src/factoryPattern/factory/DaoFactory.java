package factoryPattern.factory;

import factoryPattern.domain.product.dao.ProductDao;
import factoryPattern.domain.userInfo.dao.UserInfoDao;

public interface DaoFactory {

    UserInfoDao createUserInfoDao();
    ProductDao createProductDao();
}
