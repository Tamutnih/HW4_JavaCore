package main.java.com.example;

/**
 * Исключение, выбрасываемое при назначении слишком большой скидки на товар
 * премиум-категории.
 */
public class SaleException extends RuntimeException {
    /**
     * Конструктор класса SaleException.
     *
     * @param message сообщение об ошибке
     */
    public SaleException(String message) {
        super(message);
    }
}
