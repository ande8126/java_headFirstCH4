//example of getters and setters from CH4

class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    //getter
    String getBrand() {
        return brand;
    }
    //setter
    void setBrand(String aBrand){
        brand = aBrand;
    }
    //getter
    int getNumOfPickups(){
        return numOfPickups;
    }
    //setter
    void setNumOfPickups(int num){
        numOfPickups = num;
    }
    //getter
    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }
    //setter
    void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt = yesOrNo;
    }
}