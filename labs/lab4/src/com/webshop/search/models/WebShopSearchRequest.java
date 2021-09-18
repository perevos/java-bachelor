package com.webshop.search.models;

/**
 * Интерфейс WebShopSearchRequest содержит параметры поиска товаров, введенные пользователем.
 */
public interface WebShopSearchRequest {
    /**
     * @return текст, входящий в название товара как подстрока
     */
    String getProductNameSearchText();

    /**
     * @return максимальная цена, которую готов заплатить пользователь за товар
     */
    Double getMaximalProductPrice();

    /**
     * @return минимальный рейтинг товара, т.е., товары с меньшим рейтингом не интересны пользователю
     */
    Double getMinimalProductRating();
}
