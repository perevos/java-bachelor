package com.webshop.search.models;

/**
 * Интерфейс WebShopSearchResult возвращает информацию о товаре, которая будет отображаться в результатах поиска.
 */
public interface WebShopSearchResult {
    /**
     * @return название товара
     */
    String getProductName();

    /**
     * @return описание товара
     */
    String getProductDescription();

    /**
     * @return цена товара
     */
    String getProductPrice();

    /**
     * @return рейтинг товара
     */
    String getProductRating();

    /**
     * @return название категории товара
     */
    String getProductCategoryName();

    /**
     * @return название поставщика товара
     */
    String getProductSupplierName();

    /**
     * @return рейтинг поставщика товара
     */
    String getProductSupplierRating();
}
