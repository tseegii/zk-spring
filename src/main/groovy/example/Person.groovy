package example

class Person {
    Long id
    String name
    String surname

    @Override
    String toString() {
        "${this.class.canonicalName}: {id: $id, name: $name, surname: $surname}"
    }
}
