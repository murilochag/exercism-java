public class Test {

    public static void main(String[] args) {
        AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();


        boolean knightIsAwake = true;
        var result = AnnalynsInfiltration.canFastAttack(knightIsAwake);


        knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        result = AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);


        archerIsAwake = false;
        prisonerIsAwake = true;
        result = AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);



        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        result = AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);

        System.out.println(result);


    }
}
