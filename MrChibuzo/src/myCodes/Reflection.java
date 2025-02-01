package myCodes;

public enum Reflection {
        NORTHCENTRAL("Benue","FCT","Kogi","Kwara", "Nasarawa", "Niger", "Plateau"),
        NORTHEAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
        NORTHWEST("Kaduna","Kastina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
        SOUTHEAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
        SOUTHSOUTH("Akwa-ibom","Bayelsa","Cross-river","Delta","Edo","Rivers"),
        SOUTHWEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

        private String[] names;

        Reflection(String... names){
            this.names = names;
        }

        public String[] getNames() {
            return names;
        }
}
