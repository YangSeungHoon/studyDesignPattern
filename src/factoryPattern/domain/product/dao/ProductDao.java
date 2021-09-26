package factoryPattern.domain.product.dao;

import factoryPattern.domain.product.Product;

public interface ProductDao {

    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
