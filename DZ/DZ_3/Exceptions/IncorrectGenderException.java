package DZ.DZ_3.Exceptions;

public class IncorrectGenderException extends IllegalArgumentException {
    public IncorrectGenderException(String gender) {
        super(String.format("Введены некорретные данные, пол должен быть в формате f или m, введено %s", gender));
    }
}
