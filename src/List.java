import java.util.Random;

public class List extends AbstractList {
    public void createRandomList() {
        final Random random = new Random();
        ListElement listElement = new ListElement();
        setFirstElement(listElement);
        for (int i = 1; i < random.nextInt(Names.values().length) + 5; i++) {
            listElement.setNextListElement(new ListElement());
            listElement.getNextListElement().setPrevListElement(listElement);
            listElement = listElement.getNextListElement();
        }
        setLastElement(listElement);
    }

    public int length() {
        ListElement cElement = getFirstElement();
        int i = 0;
        while (cElement != null) {
            i++;
            cElement = cElement.getNextListElement();
        }
        return i;
    }

    public String lengthToString() {
        return "Number of students: " + length();
    }
}
