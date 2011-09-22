package example

class PersonServiceImp implements PersonService {

    PersonDao personDao

    List<Person> getPersons() {
        personDao.findAll()
    }

}
