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

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDateTime;

import java.util.List;
import java.util.Scanner;

public class  TelegramBot {


    public static class Reminder {
        String text;
        LocalDateTime trigger;

        Reminder( String text, LocalDateTime triggerTime) {
            this.text = text;
            this.trigger = triggerTime;

        }
        public String toString() {;
            return text + " "+"Время напоминания " + trigger.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        }
    }



    public static  String input1;
    public static Scanner scanner1 = new Scanner(System.in);
    public static List<Reminder> reminders = new ArrayList<>();
    public static String duration="";
    public static int num;
    public static LocalDateTime currentDuration = null;

    static class ThreadParseTrigger extends Thread{
        public void run(){
            while (true){
             for(int i=0; i < reminders.size();i++){
                 if(reminders.get(i).trigger.isEqual(LocalDateTime.now()) || reminders.get(i).trigger.isBefore(LocalDateTime.now()) ){
                     System.out.println(reminders.get(i));
                     reminders.remove(i);
                 }
             }
            }
        }
    }

    public static void helper(){
        System.out.println("  /start - это начало программы");
        System.out.println("  /remind текст : время");
        System.out.println("     Примеры:");
        System.out.println("     /remind купить хлеб : 1h");
        System.out.println("     /remind позвонить маме : 30m");
        System.out.println("     /remind сделать уроки : 2d");
        System.out.println("  /list - показать все напоминания");
        System.out.println("  /help - показать эту справку");
        System.out.println("  /delete - удаление напомнинаия");
        System.out.println("  /exit - выйти из программы\n\n");
        scanner1.nextLine();
    }
    public static void delete(){
        if (reminders.isEmpty()) {
            System.out.println("Нет активных напоминаний\n");
        }
        System.out.println("Выбери напомнинание для удаления\n");
        reminderLists();
        scanner1.nextLine();
        System.out.println("Теперь введи номер позиции для удаления\n");
        if (!scanner1.hasNextInt()) {
            System.out.println("Вы ввели не целое число\n");
        }
        num = scanner1.nextInt();
        scanner1.nextLine();
        if (num  > 0 && num< reminders.size() ){
            reminders.remove(scanner1.nextInt());
        }
        else {
            System.out.println("Вы ввели некорректное число или число превышающее размер вашего списка с напоминаниями\n");
        }

    }
    private static void reminderLists() {
        if (reminders.isEmpty()) {
            System.out.println("Нет активных напоминаний\n");
            return;
        }
        System.out.println("Ваши напоминания:\n");
        for (int i = 0; i < reminders.size(); i++) {
            System.out.println(i +" " +reminders);

        }
    }

    public static void main(String[] args) throws InterruptedException {


        do {
            ThreadParseTrigger triggerParse = new ThreadParseTrigger();
            triggerParse.start();
            System.out.println("Привет! это бот напомоминалка \n" +
                    "Для получения справки введи /help \n" +
                    "Для выхода введи /exit \n" +
                    "Для начала работы /start\n");
            input1 = scanner1.nextLine().replace(" ", "").toLowerCase();

            if (input1.equals("/exit")) {
                System.out.println("До свидания!");
                break;
            }
            if (input1.equals("/help")) {
                helper();
            }
            if (input1.equals("/list")) {
                reminderLists();
            }
            if (input1.equals("/delete")) {
                delete();
            }

            if (input1.equals("/start")){
                System.out.println("Ты зашел в Бот - напоминалку");
                System.out.println("Список доступных команд: \n" +
                        "/remind текст:время в формате 1d/m/s - для ввода и запоминания текста \n" +
                        "/list - список всех твоих напоминалок \n" +
                        "");
                input1 = scanner1.nextLine().replace(" ", "").toLowerCase();
                if (input1==null || input1.isEmpty() || !input1.contains("/")){

                    System.out.println("Введи текст согласно шаблону");
                }
                if (input1.equals("/exit")){
                    break;
                }
                if (input1.contains("/remind") && input1.contains(":") ){
                    String reminderPart = input1.substring(7).trim();
                    String[] parts = reminderPart.split(":", 2);
                    duration=parts[1];
                    if (!duration.contains("s")||!duration.contains("m")|| !duration.contains("d")){
                        System.out.println("ты ввел неправильный формат");
                    }
                    if (duration.contains("d")) {
                        try {
                            num = Integer.parseInt(parts[1].substring(0,duration.length() -1));
                        } catch (NumberFormatException e) {
                            System.out.println("Ты ввел не число\n\n");
                           continue;

                        }
                        currentDuration = LocalDateTime.now().plusDays(num);
                        reminderPart =parts[0]+" |";
                        reminders.add(new Reminder(reminderPart,currentDuration));
                        System.out.println("Успешно добавлено ваше напоминание \n" +
                                reminderPart + " "+currentDuration.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"))+"\n");




                    }
                    if (duration.contains("m")) {
                        try {
                            num = Integer.parseInt(parts[1].substring(0,duration.length() -1));
                        } catch (NumberFormatException e) {
                            System.out.println("Ты ввел не число\n\n");
                            continue;
                        }
                        currentDuration = LocalDateTime.now().plusMinutes(num);
                        reminderPart =parts[0]+" |";
                        reminders.add(new Reminder(reminderPart,currentDuration));
                        System.out.println("Успешно добавлено ваше напоминание \n" +
                                reminderPart + " "+currentDuration.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"))+"\n");



                    }
                    if (duration.contains("s")) {
                        try {
                            num = Integer.parseInt(parts[1].substring(0,duration.length() -1));
                        } catch (NumberFormatException e) {
                            System.out.println("Ты ввел не число\n\n");
                            continue;

                        }
                        currentDuration = LocalDateTime.now().plusSeconds(num);
                        reminderPart =parts[0]+" |";
                        reminders.add(new Reminder(reminderPart,currentDuration));
                        System.out.println("Успешно добавлено ваше напоминание \n" +
                                reminderPart + " "+currentDuration.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"))+"\n");


                    }
                }
                else {
                    System.out.println("Вводи текст согласно шаблону!!!\n\n\n");
                    Thread.sleep(3000);
                }
            }

        }
        while(!input1.equals("/exit"));

    }


}
