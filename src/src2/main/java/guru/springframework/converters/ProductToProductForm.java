package guru.springframework.converters;

import guru.springframework.commands.ProductForm;
import guru.springframework.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setCityId(product.getCityId());
        productForm.setCityName(product.getCityName());
        productForm.setCityAbbrev(product.getCityAbbrev());
        productForm.setCountryName(product.getCountryName());
        productForm.setCompanyName(product.getCompanyName());
        return productForm;
    }
}
