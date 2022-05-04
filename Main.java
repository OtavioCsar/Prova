class Main {
  public static void main(String[] args) {
    Discipline BDD = new Discipline("BDD", 80, "Giovanela");
    Discipline POO = new Discipline("POO", 100, "Pedro");
    Discipline Ingles = new Discipline("Ingles", 50, "Helena");

    Curso CPU = new Curso("\nCPU", BDD, POO, Ingles);
    Curso Veterinaria = new Curso("\nVeterinaria", BDD, POO, Ingles);

    Student aluno1 = new Student("Pedro", 00000, CPU);
    Student aluno2 = new Student("Otavio", 00001, Veterinaria);

    System.out.println(aluno1.curso.cAverage());
    System.out.println(aluno2.curso.cAverage());

    BDD.showReportDisc();
    POO.showReportDisc();
    
    aluno1.showReport();
    aluno2.showReport();
  }
}