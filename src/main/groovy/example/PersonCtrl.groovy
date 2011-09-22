package example

import org.zkoss.zk.ui.util.GenericForwardComposer
import org.zkoss.zul.Listbox
import org.zkoss.zk.ui.Component

class PersonCtrl extends GenericForwardComposer {

    Listbox personList

    private static final String KEY_PEOPLE="KEY_PEOPLE_VIEW_CTRL"

    @Override
    void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        desktop.setAttribute(KEY_PEOPLE, this);
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
