
	import java.io.*;

	class Person implements Serializable {
	    private static final long serialVersionUID = 1L; // Unique identifier for serialization
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    // toString method for easy display
	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	    }
	}

	public class SerializableExample {
	    public static void main(String[] args) {
	        Person person = new Person("John Doe", 30);

	        // Serialize the person object to a file
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
	            oos.writeObject(person);
	            System.out.println("Person object serialized to person.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialize the person object from the file
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
	            Person deserializedPerson = (Person) ois.readObject();
	            System.out.println("Person object deserialized from person.ser");
	            System.out.println(deserializedPerson);
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}

