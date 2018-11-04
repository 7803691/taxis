package com.kdv.taxis.dbApiTest;

        import com.kdv.taxis.bean.Brand;
        import com.kdv.taxis.dbapi.BrandServiceImpl;
        import com.kdv.taxis.service.IBrandService;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import java.io.IOException;
        import java.util.List;
        import static org.hamcrest.CoreMatchers.*;
        import static org.hamcrest.Matchers.hasProperty;
        import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
        import static org.junit.Assert.assertThat;

public class DbApiBrandServiceTest {

    private IBrandService service;

    @Before
    public void createObject() throws IOException {
        this.service = new BrandServiceImpl();

    }

    @After
    public void destroyObject(){
        service = null;
    }

    @Test
    public void selectAllBrandTest() throws IOException {
       List<Brand> allBrands = service.getAllBrands();
        Brand testBrand1 = new Brand();
        Brand testBrand2 = new Brand();
        Brand testBrand3 = new Brand();
        testBrand1.setId(1);
        testBrand1.setName("AUDI");
        testBrand2.setId(2);
        testBrand2.setName("VW");
        testBrand3.setId(3);
        testBrand3.setName("FORD");

        assertThat(allBrands, containsInAnyOrder(
               testBrand1,
               testBrand2,
               testBrand3

        ));
    }

    @Test
    public void getBrandByIdTest() throws IOException {
       Brand brand = service.getBrandById(2);
       assert brand.getName().equals("VW");
    }


    @Test
    public void getBrandCount() throws IOException {
        Integer countBrand = service.getBrandCount();
        assert countBrand.equals(3);
    }



}
