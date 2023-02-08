package robbivan.hello; // Где находится

//
/**/
/**
 * Класс Hello выполняет функционал:
 * метод main
 * @author Ivan
* */
public class Hello { //Название класса совпадает с названием файла
    public static void main(String[] args) { // В Java статик означает, что метод не привязан к экземплярам класса
        System.out.println("Hello");
        byte by = 8; //8 бит
        short sh = 16; // 16 бит
        char s = 16;
        int integer = 32;
        long longInteger = 64;


        String a = "Hello", b = "World";
        System.out.println(a + " " + b);
        String foo = "a string";
        String bar = "a string"; // bar будет указывать на тот же объект что и foo
        String baz = new String("a string"); // Чтобы гарантированно создать новую строку надо вызвать конструктор

    }

}
