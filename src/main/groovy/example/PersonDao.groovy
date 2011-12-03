package example

interface PersonDao {
    List<Person> findAll()
	Person save(Person person)
	void delete(Person person)
}
