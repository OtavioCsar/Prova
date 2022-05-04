public class Curso {
  String name;
  float nFinal;
  Discipline discipline1;
  Discipline discipline2;
  Discipline discipline3;

  Curso(String n, Discipline d1, Discipline d2, Discipline d3) {
    name = n;
    discipline1 = d1;
    discipline2 = d2;
    discipline3 = d3;
  }

  float cAverage() {
    float average = (discipline1.notaFinal + discipline2.notaFinal + discipline3.notaFinal) / 3;
    return average;
  }

  boolean approved() {
    if (cAverage() >= 60) {
      return true;
    } else {
      return false;
    }
  }

  float nFinal(int id) {
    switch (id) {
      case 1:
        return discipline1.notaFinal;
      case 2:
        return discipline2.notaFinal;
      case 3:
        return discipline3.notaFinal;
      default:
        return 0f;
    }
  }
}