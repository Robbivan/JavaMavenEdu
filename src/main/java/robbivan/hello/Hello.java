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
        // На практике не используют практически float
        float fl = 32f;
        double db = 65.; //точка как в С++

        String a = "Hello", b = "World";
        System.out.println(a + " " + b);
        String foo = "a string";
        String bar = "a string"; // bar будет указывать на тот же объект что и foo
        String baz = new String("a string"); // Чтобы гарантированно создать новую строку надо вызвать конструктор

        int i = 010; // 8 меричная СС, если начинается
        long it = 100000000000L; //литерал L для long, без него будет обычный int
        long it2 = 100_000_000_000L; // Можно вот так разбивать числа
        // unsigned не бывает

        System.out.println(i);
        int nx= (int) Math.round(fl);// Math.round неявно преобразовывает в long
        char symbol ='a';
        char symbol2 ='\u03C0'; //Unicode symbol
        char symbol3 ='\\'; //
        foo();

    }
    public static void foo(){
            final int value;
    }


}
