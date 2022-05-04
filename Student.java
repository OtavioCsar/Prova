public class Student {
  String name;
  int matricula;
  Curso curso;

  Student(String nStudent, int mStudent, Curso aCurso) {
    name = nStudent;
    matricula = mStudent;
    curso = aCurso;
  }

  void showReport() {
    System.out.println(name + curso.name + curso.approved() + matricula);
  }
}