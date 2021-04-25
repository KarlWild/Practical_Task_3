package com.company.task_5;

/**
 * Разработайте класс, который получает строковое представление
 * телефонного номера в одном из двух возможных строковых форматов:
 * +<Код страны><Номер 10 цифр>, например “+79175655655” или
 * “+104289652211”
 * или
 * 8<Номер 10 цифр> для России, например “89175655655”
 * и преобразует полученную строку в формат:
 * +<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
 * +7915-049-8721
 */
public class PhoneNumber {
    private String phone;

    public PhoneNumber(String phone) {
        this.phone = phone;
    }

    private void phoneFormatter() {
        String phoneWithoutCode = phone.substring(phone.length() - 10, phone.length());
        String phoneCode = phone.replace(phoneWithoutCode, "");
        if (phoneCode.equals("8")) phoneCode = "+7";
        StringBuilder sb = new StringBuilder();
        sb.append(phoneCode);
        int[] numbers = new int[2];
        numbers[0] = 3;
        numbers[1] = 3;
        int i = 0;
        for (char a : phoneWithoutCode.toCharArray()) {
            sb.append(a);
            numbers[i]--;
            if (numbers[i] == 0) {
                sb.append('-');
                if (i + 1 != numbers.length) i++;
            }
        }
        phone = sb.toString();
    }

    public String getPhone() {
        phoneFormatter();
        return phone;
    }
}
