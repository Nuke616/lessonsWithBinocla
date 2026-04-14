
/*
Дается строка:
name=Sergey;age=23;city=Kazan

Нужно:
Вывести в формате:
Name: Sergey
Age: 23
City: Kazan
mainstring[i].substring(0,1).toUpperCase()+mainstring[i].substring(0,1).toUpperCase()+
Важно! Порядок может быть любой. Типо city=Kazan;name=Sergey;age=23
Давай пока сделаем с помощью строк
*/
public class Lesson4 {
    public static void main(String[] args) {
        String[] mainstring = "name=Sergey;age=23;city=Kazan".replace("=", ":").replace(";", " ").split(" ");
        String finalstring = "";
        for (int i = 0; i < mainstring.length; i++) {
            finalstring = mainstring[i].substring(0, 1).toUpperCase().concat(mainstring[i].substring(1));
            System.out.println(finalstring);
        }
    }
}
