public class Discipline {
  String name;
  float notaFinal;
  Professor professor;

  Discipline(String dName, float notaFinal, String pName) {
    professor = new Professor(pName);
    name = dName;
    this.notaFinal = notaFinal;
  }

  void showReportDisc() {
    System.out.println("Disciplina:" + name + "\nProfessor:" + professor.name + "\nFinal:" + notaFinal);
  }

  float nFinal() {
    return notaFinal;
  }

}