package DZ.DZ_3.Exceptions;

public class InvalidPhoneNumberException extends NumberFormatException {
    public InvalidPhoneNumberException() {
        super("Введен некорректный номер");
    }
}
