package example

interface PersonService {
    List<Person> getPersons()
	Person save(Person person)
	void delete(Person person)
}
