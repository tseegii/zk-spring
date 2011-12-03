package example

import org.apache.log4j.Logger
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

class PersonServiceImp implements PersonService {

	private static Logger logger = Logger.getLogger(PersonServiceImp)

    PersonDao personDao

    List<Person> getPersons() {
        personDao.findAll()
    }

	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=RuntimeException)
	Person save(Person person) {
		logger.debug "saving $person"
		personDao.save(person)
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=RuntimeException)
	void delete(Person person) {
		logger.debug "deleting $person"
		personDao.delete(person)
	}

}
