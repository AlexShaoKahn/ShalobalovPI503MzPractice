import java.util.Random;

/**
 * Created by Shao on 28.05.2017.
 */
public class List extends AbstractList{
    public void createRandomList() {
        final Random random = new Random();
        ListElement listElement = new ListElement();
        setFirstElement(listElement);
        for (int i = 1; i < random.nextInt(Names.values().length); i++) {
            listElement.setNextListElement(new ListElement());
            listElement.getNextListElement().setPrevListElement(listElement);
            listElement=listElement.getNextListElement();
        }
        setLastElement(listElement);
    }

    private int length() {
        ListElement cElement=getFirstElement();
        int i=0;
        while (cElement!=null) {
            i++;
            cElement=cElement.getNextListElement();
        }
        return i;
    }

    public String lengthToString(){
        return "Number of students: "+length();
    }
}
