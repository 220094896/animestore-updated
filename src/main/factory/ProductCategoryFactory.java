package za.ac.cput.factory;

import za.ac.cput.domain.ProductCategory;

public class ProductCategoryFactory {
    public static ProductCategory createProductCategory(String categoryId, String categoryName) {
        return new ProductCategory.Builder()
                .setCategoryId(categoryId)
                .setCategoryName(categoryName)
                .build();
    }
}
