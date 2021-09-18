package com.webshop.search;

import com.webshop.search.models.WebShopSearchRequest;
import com.webshop.search.models.WebShopSearchResult;

import java.util.List;

/**
 * Интерфейс WebShopSearchService представляет собой сервис для поиска товаров в интернет-магазине.
 * Вам необходимо реализовать этот интерфейс.
 */
public interface WebShopSearchService {
    /**
     * Метод WebShopSearchService возвращает список товаров, соответствующих параметрам поиска пользователя.
     * Список должен содержать только товары, имеющиеся в наличии (т.е., getAvailableProductQuantity() > 0).
     * Список должен быть отсортирован по возрастанию цены, затем по убыванию рейтинга товара, и наконец по убыванию
     * рейтинга поставщика.
     * Список должен включать в себя максимум 20 результатов поиска. Все остальные результаты поиска, находящиеся
     * внизу отсортированного списка, должны быть отброшены.
     *
     * @param searchRequest содержит параметры поиска, введенные пользователем интернет-магазина;
     * @return список товаров, соответствующих параметрам поиска
     */
    List<WebShopSearchResult> findProducts(WebShopSearchRequest searchRequest);
}
