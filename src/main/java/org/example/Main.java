package org.example;


import java.util.*;

/**
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 *      отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {

    public static Set<Laptop> onemanyFilters(Set<Laptop> laptop){
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> listlaptop = new HashSet<>();
        System.out.println("Укажите критерии (1. -- жесткий диск, 2. -- ОЗУ, 3. -- ОС, 4. -- цвет): ");
        String criteria = scanner.nextLine();

        for (int i = 0; i < criteria.length(); i++) {
            int ch = Character.getNumericValue(criteria.charAt(i));
            if (1 == ch) {
                System.out.println("Укажите размер жёсткого диска в ГБ: ");
                int key_disk_storage = Integer.parseInt(scanner.nextLine());
                for (Laptop temp : laptop) {
                    if (key_disk_storage <= temp.getDisk_storage()) {
                        listlaptop.add(temp);
                    }
                }
            } else
            if (2 == ch) {
                System.out.println("Укажите количество ОЗУ: ");
                int key_ram = Integer.parseInt(scanner.nextLine());
                for (Laptop temp : laptop) {
                    if (key_ram <= temp.getRam()) {
                        listlaptop.add(temp);
                    }
                }
            } else
            if (3 == ch) {
                System.out.println("Укажите ОС: ");
                String key_OS = scanner.nextLine();
                for (Laptop temp : laptop) {
                    if (key_OS.equals(temp.getOs())) {
                        listlaptop.add(temp);
                    }
                }
            } else
            if (4 == ch) {
                System.out.println("Укажите цвет: ");
                String key_colour = scanner.nextLine();
                for (Laptop temp : laptop) {
                    if (key_colour.equals(temp.getColour())) {
                        listlaptop.add(temp);
                    }
                }
            }

        }
        return listlaptop;
    }

    public static Set<Laptop> minonemanyFilters(Set<Laptop> laptop){
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> listlaptop = new HashSet<>();
        System.out.println("Укажите минимальные критерии (1. -- жесткий диск, 2. -- ОЗУ, 3. -- ОС, 4. -- цвет): ");
        String criteria = scanner.nextLine();

        for (int i = 0; i < criteria.length(); i++) {
            int ch = Character.getNumericValue(criteria.charAt(i));
            if (1 == ch) {
                System.out.println("Укажите минимальный размер жёсткого диска в ГБ: ");
                int key_disk_storage = Integer.parseInt(scanner.nextLine());
                for (Laptop temp : laptop) {
                    if (key_disk_storage <= temp.getDisk_storage()) {
                        listlaptop.add(temp);
                    }
                }
            } else
            if (2 == ch) {
                System.out.println("Укажите минимальное количество ОЗУ: ");
                int key_ram = Integer.parseInt(scanner.nextLine());
                for (Laptop temp : laptop) {
                    if (key_ram <= temp.getRam()) {
                        listlaptop.add(temp);
                    }
                }
            } else
            if (3 == ch) {
                System.out.println("Укажите ОС: ");
                String key_OS = scanner.nextLine();
                for (Laptop temp : laptop) {
                    if (key_OS.equals(temp.getOs())) {
                        listlaptop.add(temp);
                    }
                }
            } else
            if (4 == ch) {
                System.out.println("Укажите цвет: ");
                String key_colour = scanner.nextLine();
                for (Laptop temp : laptop) {
                    if (key_colour.equals(temp.getColour())) {
                        listlaptop.add(temp);
                    }
                }
            }


        }
        return listlaptop;
    }
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("GV10", 17, 3.1,
                8, 2048, 3900, "Win10", "white");
        Laptop laptop2 = new Laptop("LM11", 15, 2.9,
                6, 2048, 3900, "Win10", "black");
        Laptop laptop3 = new Laptop("GV12", 16, 3.5,
                4, 1024,3900, "MacOS", "pink");
        Laptop laptop4 = new Laptop("LM13", 14, 2.4,
                6, 1024,3500, "Win10", "white");

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);

        Set<Laptop> f_laptops = new HashSet<>(onemanyFilters(laptops));
        Set<Laptop> minf_laptops = new HashSet<>(minonemanyFilters(f_laptops));
        Set<Laptop> temp = new HashSet<>(f_laptops);
        temp.retainAll(minf_laptops);

        //System.out.println(f_laptops);
        //System.out.println(minf_laptops);
        System.out.println(temp);


    }
}