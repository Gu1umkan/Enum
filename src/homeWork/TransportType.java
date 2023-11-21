package homeWork;

public enum TransportType {
    AIRPLANE (3){
        @Override
        public double calculateTravelCost(double distance) {
            return distance * getTariffFare();
        }
    },
    BUS (0.05){
        @Override
        public double calculateTravelCost(double distance) {
            return distance * getTariffFare();
        }
    },
    CAR(0.1) {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * getTariffFare();
        }
    },
    TRAIN(2) {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * getTariffFare();
        }
    },
    TRUCK(0.02) {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * getTariffFare();
        }
    };


    private  double tariffFare;

    TransportType(double tariffFare) {
        this.tariffFare = tariffFare;
    }

    public double getTariffFare() {
        return tariffFare;
    }


    public abstract double calculateTravelCost(double distance);
}
