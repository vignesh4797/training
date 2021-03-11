package guru.springframework.converters;

import guru.springframework.commands.ProductForm;
import guru.springframework.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {

    @Override
    public Product convert(ProductForm productForm) {
        Product product = new Product();
        if (productForm.getCityId() != null  && !StringUtils.isEmpty(productForm.getCityId())) {
            product.setCityId(new Long(productForm.getCityId()));
        }
        product.setCityName(productForm.getCityName());
        product.setCityAbbrev(productForm.getCityAbbrev());
        product.setCountryName(productForm.getCountryName());
        product.setCompanyName(productForm.getCompanyName());
        return product;
    }
}
