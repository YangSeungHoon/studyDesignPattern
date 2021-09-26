package factoryPattern.domain.product.dao.mysql;

import factoryPattern.domain.product.Product;
import factoryPattern.domain.product.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("InsertProduct MySQL");
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("UpdateProduct MySQL");
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("DeleteProduct MySQL");
    }
}
