public class Main {
    public static void main(String[] args) {
        //шестая домашка
        //задача первая
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName;
        fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //вторая
        String upFullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника для заполнения отчёта - " + upFullName);

        //третья
        String semicolonFullName = "";
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ') {
                semicolonFullName = semicolonFullName + ';';
            }
            semicolonFullName = semicolonFullName + fullName.charAt(i);
        }
        System.out.println("ФИО сотрудника для административного отдела - " + semicolonFullName);

        //четвёртая
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + newFullName);

        //пятая
        fullName = "Koriagina Alena Igorevna";
        int beginIndex = 0;
        int wordsQuantity = 0;
        String[] partsOfName = new String[3];
        for (int i = 0; i < fullName.length(); i++) {
            if ((fullName.charAt(i) == ' ') && (wordsQuantity < 2)) {
                partsOfName[wordsQuantity] = fullName.substring(beginIndex, i);
                beginIndex = i + 1;
                wordsQuantity++;
                if (wordsQuantity == 2) {
                    partsOfName[wordsQuantity] = fullName.substring(beginIndex, fullName.length());
                }
            }
        }
        lastName = partsOfName[0];
        firstName = partsOfName[1];
        middleName = partsOfName[2];
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        //шестая
        fullName = "ivanov ivan ivanovich";
        for (int i = 0; i < fullName.length(); i++) {
            if (i == 0) {
                fullName = fullName.substring(0, 1).toUpperCase() + fullName.substring(1);
            }
            else if (fullName.charAt(i) == ' ') {
                fullName = fullName.substring(0, i + 1) + fullName.substring(i + 1, i + 2).toUpperCase() + fullName.substring(i + 2);
            }
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);

        //седьмая
        String str1 = "135";
        String str2 = "246";
        StringBuilder sbSortString = new StringBuilder(str1 + str2);
        char tempChar;
        for (int i = 0; i < sbSortString.length() - 1; i++) {
            for (int j = 0; j < sbSortString.length() - i - 1; j++) {
                if (sbSortString.charAt(j) > sbSortString.charAt(j + 1)) {
                    tempChar = sbSortString.charAt(j);
                    sbSortString.setCharAt(j, sbSortString.charAt(j + 1));
                    sbSortString.setCharAt(j + 1, tempChar);
                }
            }
        }
        System.out.println("Данные строки - " + sbSortString);

        //восьмая
        str1 = "aaaabccddefgghiijjkk";
        System.out.println("Исходная строка - " + str1);
        char[] repeatChars = str1.toCharArray();
        System.out.print("Повторяющиеяся символы - ");
        //StringBuilder sbRepeat = new StringBuilder();
        int charQuantity = 0;
        for (int i = 0; i < repeatChars.length - 1; i++) {
            if (repeatChars[i] == repeatChars[i + 1]) {
                if (charQuantity == 0) {
                    System.out.print(repeatChars[i]);
                }
                charQuantity++;
            }
            else charQuantity = 0;
        }
    }
}