package org.example.patronesDeDiseño.Stratrgy;

public class Navigator {
    private WalginhStrategy walginhStrategy;
    private  SubwayStrategy subwayStrategy;
    private BtClicleStrategy btClicleStrategy;

    public Navigator() {
        this.btClicleStrategy = new BtClicleStrategy();
        this.subwayStrategy = new SubwayStrategy();
        this.walginhStrategy = new WalginhStrategy();
    }
    public void buildRoute(String pointA,String pointB,String stategy ){
        switch (stategy){
            case "Walking": walginhStrategy.buildRoute(pointA,pointB);
            break;
            case "Subway": subwayStrategy.buildRoute(pointA,pointB);
                break;
            case "byClicle": btClicleStrategy.buildRoute(pointA,pointB);
                break;
        }
    }
}
