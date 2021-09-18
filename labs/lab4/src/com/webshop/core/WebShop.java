package com.webshop.core;

import com.webshop.core.models.ProductAvailability;
import com.webshop.core.models.ProductCategory;
import com.webshop.core.models.ProductSupplier;

import java.util.List;

/**
 * Интерфейс WebShop представляет данные об интернет-магазине, включая список поставщиков, список категорий товаров
 * и список товаров.
 *
 * Вам не нужно реализовывать этот интерфейс, но для тестирования Вашей работы Вы можете написать класс-заглушку
 * для этого интерфейса, возвращающего статические данные для теста.
 */
public interface WebShop {

    /**
     * @return список всех поставщиков товаров, с которыми работает интернет-магазин.
     */
    List<ProductSupplier> getProductSuppliers();

    /**
     * @return список всех категорий товаров, которые поставляет интернет-магазин.
     */
    List<ProductCategory> getProductCategories();

    /**
     * @param storeId идентификатор поставщика товара
     * @param categoryId идентификатор категории товара
     * @return список товаров в зависимости от поставщика и категории товара
     */
    List<ProductAvailability> getProducts(Long storeId, Long categoryId);

}
