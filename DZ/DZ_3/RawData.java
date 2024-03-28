package DZ.DZ_3;

import java.util.ArrayList;
import java.util.Scanner;

import DZ.DZ_3.Exceptions.IncorrectGenderException;
import DZ.DZ_3.Exceptions.InvalidDateFormatException;
import DZ.DZ_3.Exceptions.InvalidPhoneNumberException;
import DZ.DZ_3.Exceptions.LackOfDataException;
import DZ.DZ_3.Exceptions.NonExistentDateException;

public class RawData {
    private Scanner sc = new Scanner(System.in, "ibm866");
    WriteToFile wf = new WriteToFile();

    public void requestingData() {
        System.out.println(
                "Введите данные в формате:\n<Фамилия> <Имя> <Отчество> <dd.mm.yyyy> <номер _ телефона> <пол>");
        String data = sc.nextLine();
        String[] pers = data.split(" ");

        if (checkLenght(pers)) {
            throw new LackOfDataException(pers.length);
        }
        if (checkBirthday(pers) == 1) {
            throw new InvalidDateFormatException(pers[3]);
        }
        if (checkBirthday(pers) == 2) {
            throw new NonExistentDateException(pers[3]);
        }
        if (checkNumber(pers)) {
            throw new InvalidPhoneNumberException();
        }
        if (!pers[5].equals("m") && !pers[5].equals("f")) {
            throw new IncorrectGenderException(pers[5]);
        }
        Person person = new Person(pers[0], pers[1], pers[2], pers[3], pers[4], pers[5]);
        wf.write(person.toString(), pers[0]);
    }

    private boolean checkLenght(String[] data) {
        if (data.length != 6)
            return true;
        return false;
    }

    private int checkBirthday(String[] data) {
        String birthday = data[3];
        String[] date = birthday.split("\\.");
        ArrayList<Integer> datBirth = new ArrayList<>();

        for (int i = 0; i < date.length; i++) {
            try {
                Integer num = Integer.parseInt(date[i]);
                datBirth.add(num);
            } catch (NumberFormatException e) {
                return 1;
            }
        }

        if (datBirth.get(0) >= 1 && datBirth.get(0) <= 31 &&
                datBirth.get(1) >= 1 && datBirth.get(1) <= 12 &&
                datBirth.get(2) >= 1900 && datBirth.get(2) <= 2024) {
            return 0;
        }
        return 2;
    }

    private boolean checkNumber(String[] data) {
        String phoneNumber = data[4];
        if (phoneNumber.length() != 10) {
            return true;
        }
        try {
            Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }
}
