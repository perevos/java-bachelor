package com.webshop.core.models;

public interface ProductSupplier {
    /**
     * @return идентификатор поставщика товаров
     */
    Long getId();

    /**
     * @return название поставщика товаров (например, "ИП Иванов И.И.")
     */
    String getName();

    /**
     * @return рейтинг поставщика товаров
     */
    Double getRating();
}
