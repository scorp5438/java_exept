package DZ.DZ_3.Exceptions;

public class LackOfDataException extends IndexOutOfBoundsException {
    public LackOfDataException(int count) {
        super(String.format("Введено данных %s, должно  быть введено 6", count));
    }
}
