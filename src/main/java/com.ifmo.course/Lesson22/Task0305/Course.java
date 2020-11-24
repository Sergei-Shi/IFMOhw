package com.ifmo.course.Lesson22.Task0305;

public class Course {
    private int price; // поле класса (цена)
    private int duration; // поле класса (продолжительность)
    private final String name; // поле класса (наименование)

    public Course(String name, int duration, int price) { // конструктор объектов класса "Course"
        this.price = price;
        this.duration = duration;
        this.name = name;
    }

    public int getPrice() { // покажет цену
        return price;
    }

    public void setPrice(int price) { // установит цену
        this.price = price;
    }

    public int getDuration() { // покажет продолжительность
        return duration;
    }

    public void setDuration(int duration) { // установит продолжительность
        this.duration = duration;
    }

    public String getName() { // покажет наименование
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false; // "instanceof" проверяет является ли "о" объектом класса "Course"

        Course course = (Course) o;

        if (price != course.price) return false;
        if (duration != course.duration) return false;
        return name != null ? name.equals(course.name) : course.name == null;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + duration;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() { // переопределен метод "toString" чтобы объекты печатались как нужно
        return "Course{" +
                "price=" + price +
                ", duration=" + duration +
                ", name='" + name + '\'' +
                '}';
    }

    public static Course getInstance() { // метод делает новые объекты "Course" с рандомными значениями
        String[] names = {"JJD", "Node js", "Python", "C++"};
        return new Course(
                names[(int) (Math.random() * names.length)],
                (int) ((Math.random() * 4) + 1),
                (int) (Math.random() * 50000) + 10000
        );
    }

}

