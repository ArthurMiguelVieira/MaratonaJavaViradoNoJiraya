package academy.arthur.maratonajava.javacore.Aintroducaoclasses.test;

import academy.arthur.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kleber";
        professor.idade = 36;
        professor.sexo = 'M';

        System.out.println("Nome: "+ professor.nome+" idade: "+professor.idade+" sexo: "+professor.sexo);
    }
}
