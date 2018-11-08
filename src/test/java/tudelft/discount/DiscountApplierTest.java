package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {
    @Test
    public void applyDiscount() {

        Product homeProduct = new Product("cheese", 10, "HOME");
        Product businessProduct = new Product("locker", 10, "BUSINESS");
        ProductDao pd = Mockito.mock(ProductDao.class);
        List<Product> products = Arrays.asList(homeProduct, businessProduct);
        Mockito.when(pd.all()).thenReturn(products);
        DiscountApplier da = new DiscountApplier(pd);
        da.setNewPrices();
        assertEquals(9,homeProduct.getPrice());
        assertEquals(11, businessProduct.getPrice());
    }
}
