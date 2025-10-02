public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutos) {
        return expectedMinutesInOven() - minutos;
    }

    public int preparationTimeInMinutes(int camadas) {
        return camadas * 2;
    }

    public int totalTimeInMinutes(int camadas, int tempoNoForno) {
        return preparationTimeInMinutes(camadas) + tempoNoForno;
    }
     
}
