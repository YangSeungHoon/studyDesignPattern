package factoryPattern.web;

import factoryPattern.domain.product.Product;
import factoryPattern.domain.product.dao.ProductDao;
import factoryPattern.domain.userInfo.UserInfo;
import factoryPattern.domain.userInfo.dao.UserInfoDao;
import factoryPattern.factory.DaoFactory;
import factoryPattern.factory.MysqlDaoFactory;
import factoryPattern.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$");
        userInfo.setUserId("Sheep");

        Product product = new Product();
        product.setProductId("123456");
        product.setProductName("Sheepsh");

        DaoFactory daoFactory = null;

        if(dbType.equals("MYSQL")){
            daoFactory = new MysqlDaoFactory();
        }else if(dbType.equals("ORACLE")){
            daoFactory = new OracleDaoFactory();
        }else {
            System.out.println("error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        System.out.println("UserInfo TRANSACTION");
        userInfoDao.insertUserInfo(userInfo);

        System.out.println("Product TRANSACTION");
        ProductDao productDao = daoFactory.createProductDao();
        productDao.insertProduct(product);
    }

}
