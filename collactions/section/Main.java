package collactions.section;
import collactions.section.services.SectionServis;
import collactions.section.services.sectionimpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SectionServis sectionServis = new sectionimpl();
        boolean a= true;
        while (a){
            System.out.println(" 1 -> Add section \n2 -> delete section \n3 -> edit section \n4 -> list secton \n5 -> position menyu \n6 -> employe menyu ");
            int n = scanner.nextInt();
            switch (n){
                case 1 -> sectionServis.addsection();
                case 2 -> sectionServis.editsection();
                case 3 -> sectionServis.deletesection();
                case 4 -> sectionServis.listsection();
                case 5 -> sectionServis.positionMenu();
                case 6 -> sectionServis.employemenyu();
            }
        }
    }
}
