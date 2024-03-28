package DZ.DZ_3.Exceptions;

public class NonExistentDateException extends IndexOutOfBoundsException {
    public NonExistentDateException(String birthday) {
        super(String.format("Введена несуществующая дата: %s", birthday));
    }
}
