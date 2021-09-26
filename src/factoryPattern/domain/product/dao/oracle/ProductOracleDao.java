package factoryPattern.domain.product.dao.oracle;

import factoryPattern.domain.product.Product;
import factoryPattern.domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("Oracle Product");
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("Oracle Product");
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("Oracle Product");
    }
}
