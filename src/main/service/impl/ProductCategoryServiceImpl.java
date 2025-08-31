package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.ProductCategory;
import za.ac.cput.repository.ProductCategoryRepository;
import za.ac.cput.service.ProductCategoryService;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory save(ProductCategory category) {
        return repository.save(category);
    }

    @Override
    public ProductCategory getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ProductCategory> getAll() {
        return repository.findAll();
    }

    @Override
    public boolean delete(String id) {
        repository.deleteById(id);
        return !repository.existsById(id);
    }
}
