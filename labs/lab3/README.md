# Язык Java (Бакалавриат, 3 курс)

## Лабораторная работа № 3 (6 баллов)

Данная работа посвящена основам объектно-ориентированного программирования в Java.

### Задание

1. **(1 балл)** Создайте перечисление (enum) ```ShapeType``` с типами геометрических фигур ```TRIANGLE```, ```RECTANGLE```, ```ELLIPSE```, ```CIRCLE```, ```SQUARE```
2. **(1 балл)** Создайте интерфейс ```Shape``` для работы с геометрическими фигурами, содержащий следующие методы:
    * ```getArea```, возвращающий площадь геометрической фигуры;
    * ```getPerimeter```, возвращающий периметр геометрической фигуры;
    * ```getType```, возвращающий тип геометрической фигуры из перечисления ```ShapeType```.
3. **(1 балл)** Cоздайте классы для треугольников, прямоугольников и эллипсов, реализующие интерфейс ```Shape```.
4. **(1 балл)** Создайте класс ```Circle``` для круга, наследующий класс ```Ellipse``` и реализующий интерфейс ```WithRadius```:  
    ```java
    interface WithRadius {
        /**
         * @return радиус
         */
        double getRadius();
    }
    ```
    Класс ```Circle``` должен также реализовать следующий статический метод:
    ```java
    /**
     * @param area площадь круга
     * @return круг с заданной площадью area
     */
    static Circle fromArea(double area)
    ```
5. **(1 балл)** Создайте класс ```Square``` для квадрата, наследующий класс ```Rectangle```. Добавьте к классу ```Square``` статический метод ```fromArea``` аналогично классу ```Circle```.
6. **(1 балл)** Реализуйте следующий интерфейс:
    ```java
    interface ShapeCalculator {
        /**
         * @param shapes массив геометрических фигур
         * @return суммарная площадь геометрических фигур shapes
         */ 
        double getArea(Shape[] shapes);
    }
    ```