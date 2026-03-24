
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
        String[] mainString = "name=Sergey;age=23;city=Kazan".replace("=",":").replace(";"," ").split(" ");
        String finalString="";
        for (int i =0; i < mainString.length;i++){
            finalString= mainString[i].substring(0,1).toUpperCase().concat(mainString[i].substring(1).replace(":",": "));
            System.out.println(finalString);

        }


    }
}
