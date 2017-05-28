/**
 * Created by Shao on 28.05.2017.
 */
public class ListElement {
    private ListElement prevListElement;
    private ListElement nextListElement;
    private StudentData studentData;

    public ListElement() {
        studentData=new StudentData();
    }

    public ListElement(Names name, double averageScore, boolean sport) {
        studentData=new StudentData(name, averageScore, sport);
    }

    public ListElement getPrevListElement() {
        return prevListElement;
    }

    public void setPrevListElement(ListElement prevListElement) {
        this.prevListElement = prevListElement;
    }

    public ListElement getNextListElement() {
        return nextListElement;
    }

    public void setNextListElement(ListElement nextListElement) {
        this.nextListElement = nextListElement;
    }

    public StudentData getStudentData() {
        return studentData;
    }

    public void setStudentData(Names name, double averageScore, boolean sport) {
        studentData.setName(name);
        studentData.setAverageScore(averageScore);
        studentData.setSport(sport);
    }
}
