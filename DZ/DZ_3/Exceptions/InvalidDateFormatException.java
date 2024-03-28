package DZ.DZ_3.Exceptions;

public class InvalidDateFormatException extends IllegalArgumentException {
    public InvalidDateFormatException(String birthday) {
        super(String.format("Введена некорректная дата. Верный формат dd.mm.yyyy, введено %s", birthday));
    }
}
