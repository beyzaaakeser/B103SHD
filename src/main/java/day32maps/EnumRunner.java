package day32maps;

public class EnumRunner {

    public static void main(String[] args) {

        String capital= UsStates.CALIFORNIA.getCapital();
        System.out.println(capital); // Sacramento

        String abbr = UsStates.FLORIDA.getAbbrevaition();
        System.out.println(abbr); //FL

        String state= UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state); // Florida

        String stateName = UsStates.getStateNameFromCapital("Denver");
        System.out.println(stateName); // Colorado


        // Example 1: baskenti verilen state'in kisaltmasini ekrana yazdiran methodu olusturunuz
        String abbr2 = UsStates.getAbbreviationFromCapital("Atlanta");
        System.out.println(abbr2); // GA



    }


}
