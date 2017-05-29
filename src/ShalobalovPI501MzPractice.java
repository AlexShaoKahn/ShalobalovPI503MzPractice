import javax.jws.soap.SOAPBinding;

public class ShalobalovPI501MzPractice {
    public static void main(String[] args) {
        List list = new List();
        int choice = -1;
        int elementNumber;
        list.createRandomList();
        userMenuGenerator(list);
        do {
            switch (choice) {
                case 1:
                    list.createRandomList();
                    userMenuGenerator(list);
                    break;
                case 2:
                    UserInterface.userMenu();
                    System.out.println(list.toString());
                    System.out.println("\nPossible student names: ");
                    System.out.println(UserInterface.allStudentNames());
                    break;
                case 3:
                    list.addFirstListElement();
                    userMenuGenerator(list);
                    System.out.println("Added: " + list.getFirstElement().getStudentData().toString());
                    break;
                case 4:
                    list.removeLastListElement();
                    userMenuGenerator(list);
                    System.out.println("Last elementNumber removed");
                    break;
                case 5:
                    elementNumber = UserInterface.getElement();
                    userMenuGenerator(list);
                    System.out.println("\nStudent number " + elementNumber + " is:");
                    System.out.println(list.getListElement(elementNumber).getStudentData().toString());
                    break;
                case 6:
                    elementNumber = UserInterface.getElement();
                    StudentData oldStudent = new StudentData(list.getListElement(elementNumber).getStudentData());
                    list.setListElement(elementNumber);
                    userMenuGenerator(list);
                    System.out.println("\nStudent number " + elementNumber);
                    System.out.println(oldStudent.toString());
                    System.out.println("is changed to");
                    System.out.println(list.getListElement(elementNumber).getStudentData().toString());
                    break;
                case 7:
                    UserInterface.userMenu();
                    System.out.println(list.toString());
                    System.out.println(list.lengthToString());
                    break;
                case 8:
                    UserInterface.userMenu();
                    System.out.println(list.toString());
                    System.out.println("\nLast element is:");
                    System.out.println(list.getLastElement().getStudentData().toString());
                    break;
                case 9:
                    elementNumber = UserInterface.getElement();
                    userMenuGenerator(list);
                    System.out.println("Previous element of " + elementNumber + " is:");
                    System.out.println(list.getBackNextElement(list.getListElement(elementNumber)).getStudentData().toString());
                    break;
                case 10:
                    List list01 = (List) list.cutFromList(list, UserInterface.getN(), UserInterface.getM());
                    list = list01;
                    userMenuGenerator(list);
                    break;
                case 11:
                    UserInterface.userMenu();
                    System.out.println(list.toString());
                    System.out.println("\nHight achiver and sport students:");
                    System.out.println(list.listSportAndFive());
                    break;
                default:
                    UserInterface.userMenu();
                    System.out.println(list.toString());
                    if (choice > -1) System.out.println("\n" + choice + " is wrong menu number!");
            }
            choice = UserInterface.choice();
        } while (choice != 0);
    }

    private static void userMenuGenerator(List list) {
        UserInterface.randomElement(list);
        UserInterface.randomN(list);
        UserInterface.randomM(list);
        UserInterface.userMenu();
        System.out.println(list.toString());
    }
}