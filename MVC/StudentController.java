package mvc;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getNome();
    }

    public void setStudentName(String name) {
        model.setNome(name);
    }

    public void setStudentMatricula(String matricula){
        model.setMatricula(matricula);
    }
    public String getStudentMatricula(String matricula){
        return model.getMatricula();
    }

    public void updateView(){
        view.printStudent(model.getNome(), model.getMatricula());
    }
    
}
