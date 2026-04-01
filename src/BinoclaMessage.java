/*
1. Сообщение от Binocla:
Создай класс `BinoclaMessage` . У класса должны быть поля: `String text`  и  `String author`  и метод: `printMessage` который выводит текст вида `author: text` , где `author` и `text` - поля
Пример:
author = `Binocla`

    text = `любит Java`
    то после вызова метода у нас вывод `Binocla: любит Java`

2. Расширяем предыдущую задачку. Нужно добавить методы
`int getTextLength()` - возвращает длину текста

    `boolean containsWord(String word)` - проверяет, есть ли слово в сообщении

    `void printInfo()` - выводит:

    - автора
    - текст
    - длину текста

    Пример: `Binocla любит котиков и Java`

    тогда при вызове метода `containsWord("Java")` - мы вернем true (ну и можно прям в консоль вывести все это дело)

3. Продолжение для предыдущего)

    Сделай поля `author` и `text` `private`.

    Добавь методы:

    - `void setAuthor(String author)`
    - `void setText(String text)`
    - `String getAuthor()`
    - `String getText()`

    И бонусом давай сделаем так, чтобы `setText` и `setAuthor` не принимал `null` И (!) пустую строку (типо `""`  или `"  "` )

4. Бонус
Почему мы с тобой можем создать экземляр класса у которого нет полей и методов? например:
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BinoclaMessage {
    private static String text;
    private static String author;

    private static void printMessage() {
        System.out.println(author + ':' + ' ' + text);


    }

    public static void main(String[] args) {
         String pult = "";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Поиграем в игру ? Да/Нет");
            pult=scan.nextLine().toLowerCase();
            try {
                Integer.parseInt(pult);
                throw new IllegalArgumentException("у тебя там число досвидули. Или введи имя");
            } catch (NumberFormatException e) {
            }
            System.out.println("Заполните поле: author");
            author = scan.nextLine();
            try {
                Integer.parseInt(author);
                throw new IllegalArgumentException("у тебя там число досвидули. Или введи имя");
            } catch (NumberFormatException e) {
            }
            System.out.println("Заполните поле: text");
            text = scan.nextLine();
            try {
                Integer.parseInt(text);
                throw new IllegalArgumentException("у тебя там число досвидули. Или введи имя");
            } catch (NumberFormatException e) {
            }
            printMessage();


        }


        while (pult != "нет");
    }
}

