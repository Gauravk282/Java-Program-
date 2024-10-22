/*Create a class Person with attributes name, age and country. Implement methods to set and get these attributes.
Create an object of this class, set its attributes, and print out the details.
Constructor Overloading: Extend the Person class from the previous problem and add multiple constructors
(default, parameterized, etc.) to initialize the attributes.
Also, include a method to display the details.*/

package JavaProgramCodes.Person;

public class Person {
	String name;
	int age;
	String country;

	public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void displayDetails() {
		System.out.println("Name    : " + name);
		System.out.println("Age     : " + age);
		System.out.println("Country : " + country);
	}

}
