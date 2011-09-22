package example

import org.zkoss.xel.VariableResolver
/*
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zkspringessentials.beans.*;
SimpleBean simple = SpringUtil.getBean("simpleBean");

*/

class PersonResolver implements VariableResolver {

    def resolveVariable(String name) {
        "persons" == name ? getPersons() : null
    }

    private List<Person> persons
    List<Person> getPersons() {
        if (!persons) {
            persons = [
                new Person(name: "name 1", surname: "surname 1"),
                new Person(name: "name 2", surname: "surname 2"),
                new Person(name: "name 3", surname: "surname 3")
            ]
        }
        persons
    }

}
