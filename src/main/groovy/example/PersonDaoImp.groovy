package example

import org.springframework.orm.hibernate3.support.HibernateDaoSupport

class PersonDaoImp extends HibernateDaoSupport implements PersonDao {
    public List<Person> findAll() {
        return hibernateTemplate.find("from Person");
    }
}
