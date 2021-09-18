package com.webshop.core.models;

/**
 * Интерфейс ProductAvailability содержит методы, возвращающие данные о товаре у конкретного поставщика, включая количество
 * доступных единиц товара.
 */
public interface ProductAvailability {
    /**
     * @return идентификатор товара у конкретного поставщика (у разных поставщиков один и тот же товар может иметь
     *         разные идентификаторы)
     */
    Long getProductId();

    /**
     * @return идентификатор поставщика товара
     */
    Long getProductSupplierId();

    /**
     * @return название товара
     */
    String getProductName();

    /**
     * @return описание товара
     */
    String getProductDescription();

    /**
     * @return рейтинг товара (вещественное число от 1 до 5, например, 2.8)
     */
    Double getProductRating();

    /**
     * @return цена единицы товара
     */
    Double getProductPrice();

    /**
     * @return количество единиц товара, доступных у поставщика
     */
    Long getAvailableProductQuantity();
}
