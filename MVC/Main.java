package mvc;
public class Main {
    public static void main(String[] args) {
        StudentModel model = buscarNoBanco();
        
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Comissario Gordon");

        controller.updateView();
    }

    private static StudentModel buscarNoBanco(){
        StudentModel student = new StudentModel();
        student.setNome("Heisenberg da computação bioinspirada");
        student.setMatricula("12345BSI67");
        return student;
    }
}
