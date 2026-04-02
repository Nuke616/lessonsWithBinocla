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
    private  String text=new String();
    private  String author =new String();

    private  void setAuthor(String author){
        if (author == null || author.isEmpty()){
            System.out.println("Нельзя такое делать!!!!");
        }
        else {
            this.author = author;
        }
    }
    private  void setText(String text){
        if (text == null || text.isEmpty()){
            System.out.println("Нельзя такое делать!!!!");
        }
        else {
            this.text = text;
        }


    }
    String getAuthor(){
return author;
    }
            String getText(){
        return text;
            }


    private  void printMessage() {
        System.out.println(getAuthor()+" "+getText());

    }
    private  int getTextLength(){
        return (author+" "+text).length();
    }

   private  boolean containsWord(String word){
        return (author+" "+text).contains(word);
    }

    public static void main(String[] args) {
         String pult = "";
        BinoclaMessage SeregaHi = new BinoclaMessage();
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Поиграем в игру ? Да/Нет");
            pult=scan.nextLine().toLowerCase();
            if(!pult.equals("да")){
                System.out.println("пока");
                break;
            }
            System.out.println("Заполните поле: author");
            SeregaHi.setAuthor(scan.nextLine());

            System.out.println("Заполните поле: text");
            SeregaHi.setText(scan.nextLine());

            SeregaHi.printMessage();
            System.out.println("Проверить длину текста ?");
            pult=scan.nextLine();
            if(!pult.equals("да")){
                System.out.println("ну и ладно");

            }
            else {
                System.out.println("Длина слова:" + SeregaHi.getTextLength());

            }
            System.out.println("Проверим, содержится ли твое слово ?");
            pult= scan.nextLine();

            if(!pult.equals("да")){
                System.out.println("ну и ладно");

            }
            else {
                System.out.println("Тогда введи слово");
                pult= scan.nextLine();
                if(SeregaHi.containsWord(pult)){
                    System.out.println("Рил содержится");
                }
                else {
                    System.out.println("Нету искомого слова");
                }

            }

        }

        while (!pult.equals("нет"));
    }
}

