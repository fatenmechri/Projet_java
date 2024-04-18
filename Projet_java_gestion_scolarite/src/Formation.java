public  class Formation {
    private String intitule;
    private int duree;
    private double cout;

    public Formation(String intitule, int duree, double cout) {
        this.intitule = intitule;
        this.duree = duree;
        this.cout = cout;
    }

    public  double getCout(){
        return cout;
    };
}
