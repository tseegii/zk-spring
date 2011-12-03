package example

import org.springframework.orm.hibernate3.support.HibernateDaoSupport

class PersonDaoImp extends HibernateDaoSupport implements PersonDao {

    List<Person> findAll() {
        return hibernateTemplate.find("from Person");
    }

	@Override
	Person save(Person person) {
		hibernateTemplate.saveOrUpdate(person)
	}
}
