public class Discipline {
  String name;
  float notaFinal;
  Professor professor;

  Discipline(String dName, float nFinal, String pName) {
    professor = new Professor(pName);
    name = dName;
    notaFinal = nFinal;
  }

  void showReportDisc() {
    System.out.println("\nDisciplina:" + name + "\nProfessor:" + professor.name + "\nFinal:" + notaFinal);
  }
  float nFinal() {
    return notaFinal;
  }

}