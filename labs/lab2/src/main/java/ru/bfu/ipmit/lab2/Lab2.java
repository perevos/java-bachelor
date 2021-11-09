package ru.bfu.ipmit.lab2;

public class Lab2 {
    /**
     * Метод getKSmallestNumbers возвращает k наименьших элементов в массиве array, отсортированных в порядке возрастания
     *
     * @param array неотсортированный массив типа byte произвольной длины n
     * @param k целочисленный параметр, 0 <= k <= n
     * @return отсортированный массив из k наименьших элементов
     *
     * ПРИМЕР:
     * Вход: array = [8, 9, 1, 10], k = 2
     * Выход: [1, 8]
     *
     */
    static byte[] getKSmallestNumbers(byte[] array, int k) {
        if (array.length == 0) {
            return array;
        }
        int h = 0;
        for (int i = 0; i < array.length; i++) {
            byte max = array[0];
            int max_index = 0;
            for (int j = 1; j < array.length - h; j++) {
                if (max < array[j]) {
                    max = array[j];
                    max_index = j;
                }
            }
            byte swap = array[array.length-1-h];
            array[array.length-1-h] = max;
            array[max_index] = swap;
            h++;
        }
        byte[] newArr = (array.length > k) ? new byte[k] : new byte[array.length];
        for (int i = 0; i < k && i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

    /**
     * Метод arePermutations проверяет, является ли первая строка перестановкой второй, то есть может ли первая строка
     * быть получена из второй путем перестановки символов.
     *
     * @param firstString первая строка произвольной длины, состоящая из цифр 0...9
     *                    и строчных букв латинского алфавита a...z
     * @param secondString вторая строка произвольной длины
     * @return true, если первая строка является перестановкой второй
     *         false, в противном случае
     *
     * ПРИМЕР 1:
     * Вход: firstString = "ab1", secondString = "b1a"
     * Выход: true
     *
     * ПРИМЕР 2:
     * Вход: firstString = "ab", secondString = "aa"
     * Выход: false
     *
     */
    static boolean arePermutations(String firstString, String secondString) {
        boolean flag = true;
        for (int i = 0; i < firstString.length(); i++) {
            for (int j = 0; j < secondString.length(); j++) {
                if (firstString.charAt(i) == secondString.charAt(j)) {
                    secondString.replaceFirst(Character.toString(secondString.charAt(j)),"_");
                    break;
                }
                if (j == secondString.length() - 1) {
                    flag = false;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return flag;
    }

    /**
     * Метод rotateMatrix совершает поворот элементов квадратной матрицы на 90 градусов по часовой стрелке
     *
     * @param matrix целочисленная квадратная матрица
     * @return целочисленная квадратная матрица, полученная путем поворота исходной матрицы на 90 градусов
     *         по часовой стрелке
     *
     * ПРИМЕР:
     * Вход: matrix = [1, 2, 3
     *                 4, 5, 6
     *                 7, 8, 9]
     * Выход: [7, 4, 1
     *         8, 5, 2
     *         9, 6, 3]
     *
     */
    static int[][] rotateMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return matrix;
        }
        int n = matrix[0].length;
        int[][] newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j]=matrix[n-1-j][i];
            }
        }
        return newMatrix;
    }
}
