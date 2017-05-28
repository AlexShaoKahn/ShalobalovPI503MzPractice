import java.security.acl.LastOwnerException;

/**
 * Created by Shao on 27.05.2017.
 */
abstract class AbstractList {
    private ListElement firstElement;
    private ListElement lastElement;

    public void addFirstListElement(Names name, double averageScore, boolean sport) {
        firstElement.setPrevListElement(new ListElement(name, averageScore, sport));
        firstElement.getPrevListElement().setNextListElement(firstElement);
        firstElement = firstElement.getPrevListElement();
    }

    public void removeLastListElement() {
        lastElement = lastElement.getPrevListElement();
        lastElement.setNextListElement(null);
    }

    @Override
    public String toString() {
        ListElement cElement = firstElement;
        int i = 0;
        String list = "------------------------------------------------\n";
        do {
            list += i < 10 ? "0" + i : i;
            list += "  " + cElement.getStudentData().toString() + "\n";
            cElement = cElement.getNextListElement();
            i++;
        } while (cElement != null);
        list += "------------------------------------------------";
        return list;
    }

    public AbstractList cutFromList(AbstractList list, int n, int m) {
        AbstractList newList = list;
        newList.getListElement(n).setPrevListElement(null);
        newList.getListElement(m).setNextListElement(null);
        newList.setFirstElement(newList.getListElement(n));
        newList.setLastElement(newList.getListElement(m));
        return newList;
    }

    public ListElement getListElement(int n) {
        ListElement listElement = getFirstElement();
        for (int i = 0; i < n; i++) {
            listElement = listElement.getNextListElement();
        }
        return listElement;
    }

    public void setListElement(int n, Names name, double averageScore, boolean sport) {
        getListElement(n).setStudentData(name, averageScore, sport);
    }

    public ListElement getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(ListElement firstElement) {
        this.firstElement = firstElement;
    }

    public ListElement getLastElement() {
        ListElement cElement = firstElement;
        while (cElement.getNextListElement() != null) {
            cElement = cElement.getNextListElement();
        }
        return cElement;
    }

    public ListElement getBackNextElement(ListElement listElement) {
        return listElement.getPrevListElement();
    }

    public void setLastElement(ListElement lastElement) {
        this.lastElement = lastElement;
    }

    public String listSportAndFive() {
        ListElement cElement = firstElement;
        int i = 0;
        String list = "------------------------------------------------\n";
            do {
                if (cElement.getStudentData().getAverageScore() == 5 && cElement.getStudentData().isSport()) {
                    list += i < 10 ? "0" + i : i;
                    list += "  " + cElement.getStudentData().toString() + "\n";
                    i++;
                }
                cElement = cElement.getNextListElement();
            } while (cElement != null);
        list += "------------------------------------------------";
        return list;
    }
}
