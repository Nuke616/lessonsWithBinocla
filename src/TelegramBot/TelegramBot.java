/*
Telegram бот-напоминалка
Homework: сделать все что ниже, но в консоли
Telegram бот (Maven / Gradle)
Обрабатываем команды (/start + /remind *text* + /help)
*текст* -> запись вида текст_напоминания : cron_time_expression.
 Пример: /remind покормить собаку : 2h, /remind отправить посылку по адресу 1245... :
 3d | без доп библиотеки
Храним в памяти напоминалки (тексты по команде /remind)
Бонус - интеграция с ChatGPT (OpenAI)
 */

package TelegramBot;

import java.util.ArrayList;
import java.time.LocalDateTime;

import java.util.List;
import java.util.Scanner;

public class  TelegramBot  {

    static class Reminder {
        String text;
        LocalDateTime trigger;

        Reminder(String text, LocalDateTime triggerTime) {
            this.text = text;
            this.trigger = triggerTime;
        }
    }

    public static void main(String[] args) {
        String input1;
        Scanner scanner1 = new Scanner(System.in);
        List<Reminder> reminders = new ArrayList<>();
        LocalDateTime localDate = LocalDateTime.now();  ;
        String duration;
        int num;
        LocalDateTime currentDuration = null;

        while(true){
            System.out.println("Привет! это бот напомоминалка. Команды: /start, /remind текст : время, /list, /help, /exit");
            input1 = scanner1.nextLine().replace(" ", "").toLowerCase();

            if (input1.equals("/exit")) {
                System.out.println("До свидания!");
                break;
            }
            if (input1.equals("/start")){
                System.out.println("Ты зашел в Бот - напоминалку");
                input1 = scanner1.nextLine().replace(" ", "").toLowerCase();
                if (input1.equals("/exit")){
                    break;
                }
                if (input1.contains("/remind")){
                    String reminderPart = input1.substring(7).trim();
                    String[] parts = reminderPart.split(":", 2);


                }
                System.out.println("через сколько ты хочешь чтобы тебе напомнили это\\n " +
                                "Допустимый формат:\\n" +
                                "1d - один день\\n" +
                                "1s - одна секунда" +
                                "1m - одна минута"
                        );
                duration=scanner1.nextLine().replace(" ", "").toLowerCase();
                if (duration.contains("d")) {
                    num = Integer.parseInt(duration.substring(0,duration.length() -1));
                    currentDuration = localDate.plusDays(num);

                }

                if (localDate.isAfter(currentDuration)){
                    System.out.println(reminders.get(0));
                }

            }



        }

    }


}
