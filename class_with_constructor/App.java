public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();
        // Calls the sayMyStats method
        knight.sayMyStats();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();
        // Calls the sayMyStats method
        mage.sayMyStats();

        // Creates a new object named "thief" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();
        // Calls the sayMyStats method
        thief.sayMyStats();

        // Creates a new object named "student" from Character class
        Character student = new Character(10, 10, 10, "Angelo");
        // Calls the sayMyName method
        student.sayMyName();
        // Calls the sayMyStats method
        student.sayMyStats();

        // Creates a new object named "teacher" from Character class
        Character teacher = new Character(10, 10, 10, "elizer");
        // Calls the sayMyName method
        teacher.sayMyName();
        // Calls the sayMyStats method
        teacher.sayMyStats();

    }
}
