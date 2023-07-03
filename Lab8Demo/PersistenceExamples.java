import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class PersistenceExamples {

    private static final File CWD = new File(".");

    private static String localPath = "file.txt";

    private static File file = Utils.join(CWD, localPath);

    public static void main(String[] args) {
        // File object gets instantiated. But you are not creating a file.
        // The file is created whenever you write.

        // String IO:
        // File is created if it does not exist
        // The previous version of the file is overwritten - try different strings and run over multiple times
//        writeStringExample();
//        readStringExample();

        // Object IO:
        // 1. Show writing, and show the file
        // 2. Show the reading, add age, and writeback function (you're able to remember program state).
        // 3. Show to students that if you modify the Dog class, reading previous versions of Dogs won't
        // work.
//         createObjectExample();
//         readObjectExample();

        // Creating a folder
        // YOU CAN'T WRITE CONTENTS TO A DIRECTORY! YOU'LL GET ERRORS THIS WAY.
//        folderExample();
//        writeStringExample();
//        createObjectExample();

        // Don't confuse: (files, directories), (string io, object io)!
    }

    public static void folderExample() {
        if (!file.exists()) {
            file.mkdir();
        }
    }

    public static void writeStringExample() {
        Utils.writeContents(file, "Raiden Shogun");
    }

    public static void readStringExample() {
        String stringContents = Utils.readContentsAsString(file);
        System.out.println(stringContents);
        Utils.writeContents(file, stringContents + " can't cook\n");
    }

    public static void createObjectExample() {
        Student s = new Student(18, "Collei");
        Utils.writeObject(file, s);
    }

    public static void readObjectExample() {
        Student s = null;
        s = Utils.readObject(file, Student.class);
        s.age++;
        System.out.println(s);
        Utils.writeObject(file, s);
    }
}

class Student implements Serializable {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "My name is " + name + ", and my age is " + age + ".";
    }
}
