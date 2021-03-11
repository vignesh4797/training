package guru.springframework.controllers;

//import guru.springframework.commands.ProductForm;
//import guru.springframework.converters.ProductToProductForm;
import guru.springframework.domain.Product;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
//import javax.validation.Valid;

/**
 * Created by jt on 1/10/17.
 */
@Controller
public class ProductJController {
    private ProductService productService;

    
    @Autowired
    public void setProductService(ProductService ProductService) {
        this.productService = ProductService;
    }

    @RequestMapping("/all")
    public String redirToList(){
        return "redirect:/jproduct/listjson";
    }

    @RequestMapping("/jproduct/listjson")
    public ResponseEntity<List<Product>> listJProduct(){
        return ResponseEntity.ok(productService.listAll());
    }


    @RequestMapping("/jproduct/show/{CityId}")
    public ResponseEntity<Product> getProduct(@PathVariable String CityId){
        return ResponseEntity.ok(productService.getByCityId(Long.valueOf(CityId)));
    }

    @RequestMapping(value = "/jproduct", method = RequestMethod.POST)
    public ResponseEntity<Product> saveOrUpdateJProduct(@RequestBody Product Product){
    	Product savedProduct = productService.saveOrUpdate(Product);
        return ResponseEntity.ok(savedProduct);
    }


    @RequestMapping("/jproduct/delete/{CityId}")
    public ResponseEntity<Object> delete(@PathVariable String CityId){
    	productService.delete(Long.valueOf(CityId));
        return ResponseEntity.noContent().build();
    }
}
