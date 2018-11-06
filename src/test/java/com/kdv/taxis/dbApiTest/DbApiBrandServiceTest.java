package com.kdv.taxis.dbApiTest;

        import com.kdv.taxis.bean.Brand;
        import com.kdv.taxis.config.LogAppenderResource;
        import com.kdv.taxis.dbapi.BrandServiceImpl;
        import com.kdv.taxis.service.IBrandService;


        import org.apache.log4j.LogManager;
        import org.apache.log4j.Logger;
        import org.junit.*;

        import java.io.IOException;
        import java.util.List;


        import static org.hamcrest.Matchers.hasProperty;
        import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
        import static org.junit.Assert.assertThat;

public class DbApiBrandServiceTest {


    private IBrandService service;
    private Brand testBrand1;
    private Brand testBrand2;
    private Brand testBrand3;




    @Before
    public void createObject() throws IOException {
        this.service = new BrandServiceImpl();
        testBrand1 = new Brand();
        testBrand2 = new Brand();
        testBrand3 = new Brand();
        testBrand1.setId(1);
        testBrand1.setName("AUDI");
        testBrand2.setId(2);
        testBrand2.setName("VW");
        testBrand3.setId(3);
        testBrand3.setName("FORD");

    }

    @After
    public void destroyObject(){
        service = null;
        Brand testBrand1 = null;
        Brand testBrand2 = null;
        Brand testBrand3 = null;

    }






    @Test
    public void selectAllBrandTest() throws IOException {
        List<Brand> allBrands = service.getAllBrands();

        assertThat(allBrands, containsInAnyOrder(
               testBrand1,
               testBrand2,
               testBrand3
        ));

    }


    @Test
    public void getBrandByIdTest() throws IOException {
       Brand brand = service.getBrandById(2);
       //assertThat(appender.getOutput(),brand.getName().equals("BMW"));
    }


    @Test
    public void getBrandCount() throws IOException {
        Integer countBrand = service.getBrandCount();
        assert countBrand.equals(3);
    }



}
