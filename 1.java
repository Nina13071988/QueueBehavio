import java.util.LinkedList;
import java.util.Queue;

interface QueueBehaviour {
    void enqueue(Person person);
    Person dequeue();
}

interface MarketBehaviour {
    void addPerson(Person person);
    void removePerson(Person person);
}

class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Person> queue;
    private LinkedList<Person> people;

    public Market() {
        this.queue = new LinkedList<>();
        this.people = new LinkedList<>();
    }

    @Override
    public void enqueue(Person person) {
        this.queue.add(person);
    }

    @Override
    public Person dequeue() {
        return this.queue.poll();
    }

    @Override
    public void addPerson(Person person) {
        this.people.add(person);
        this.enqueue(person);
    }

    @Override
    public void removePerson(Person person) {
        this.people.remove(person);
    }

    public void update() {
        // Обновляет состояние магазина (принимает и отдает заказы)
    }
}

class Person {
    // Класс Person
}