package example

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

class PersonServiceImp implements PersonService {

    PersonDao personDao

    List<Person> getPersons() {
        personDao.findAll()
    }

	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=RuntimeException)
	Person save(Person person) {
		personDao.save(person)
	}

}
