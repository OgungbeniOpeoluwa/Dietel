package umlDiagram;

public enum GeopoliticalZone {
    NORTHCENTRAL("BENUE","FCT","KOGI","KWARRA","NASARAWA","NIGER","PLATEU"),
    NORTHEAST("ADAMAWA","BAUCHI","BORNO","GOMBE","TARABA","YOBE"),
    NORTHWEST("KADUNA","KASTINA","KANO","KEBBI","SOKOTO","JIGAWA","ZAMFARA"),
    SOUTHEAST("ABIA","ANAMBRA","EBONYI","ENUGU","IMO"),
    SOUTHSOUTH("AKWA IBOM","BAYELSA","CROSS RIVER","DELTA","EDO","RIVERS"),
    SOUTHWEST("EKITI","LAGOS","OSUN","ONDO","OGUN","OYO");
    private String [] state;
    GeopoliticalZone(String...state){
       this.state = state;
    }
    public String [] getState(){
        return state;
    }
    public static GeopoliticalZone getGeogrphicalZone(String state) {
        GeopoliticalZone result = null;
        for(GeopoliticalZone numb : GeopoliticalZone.values()){
            if(checkGeographical(numb,state)){
                result = numb;
            }}
        return result;
    }
    private static boolean checkGeographical(GeopoliticalZone zone, String state){
        boolean result = false;
        for(int count = 0 ; count < zone.getState().length; count++ ){
            if(zone.getState()[count].equals(state.toUpperCase())){
                result = true;
            }
        }
        return result;
    }

}
