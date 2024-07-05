import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat ("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

        System.out.println(cats.toString()); // [Cat{name='Томас'}, Cat{name='Бегемот'}, Cat{name='Филипп Маркович'}, Cat{name='Пушок'}]
        int thomasIndex = cats.indexOf(thomas);
        System.out.println(thomasIndex); // 0

        System.out.println(cats.get(1)); //  Cat{name='Бегемот'}
        System.out.println(cats.contains(pushok)); // true

        Cat kisa = new Cat("Kisa");
        cats.set(0, kisa);
        System.out.println(cats.toString());
        // [Cat{name='Kisa'}, Cat{name='Бегемот'}, Cat{name='Филипп Маркович'}, Cat{name='Пушок'}]

        cats.clear();
        System.out.println(cats.toString()); // []
        System.out.println();

        Cat[] catsArray = {thomas, behemoth, philipp, pushok};
        ArrayList<Cat> catslist = new ArrayList<>(Arrays.asList(catsArray));
        System.out.println("Преообразвание массива в список: \n"+catslist.toString());
        System.out.println();

        Cat[] catsArray2 = catslist.toArray(new Cat[0]);
        System.out.println("Преобразование списка в массив:\n" + Arrays.toString(catsArray2));

        System.out.println(catslist.size()); // 4
    }
}