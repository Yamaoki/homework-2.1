public class Human {
    private final String name;
    private final String town;
    private final int yearOfBirth;
    private final String job;

    Human(String name, String town, int year, String job) {
        if (year > 0) {
            this.yearOfBirth = 2022 - year;
        } else {
            yearOfBirth = 0;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }
    void humanHe() {
        System.out.println("Привет! Меня зовут - " + name + ". Я из города - " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности - " + job + " Будем знакомы!");
    }
    void humanShe() {
        System.out.println("Привет! Меня зовут - " + name + ". Я из города - " + town + ". Я родилась в " + yearOfBirth + " году. Я работаю на должности - " + job + " Будем знакомы!");
    }
}
